package com.game;
 
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
 
public class MyGame extends InputAdapter implements ApplicationListener {
    Stage stage;
    TextureAtlas atlas ;
    Group projectiles;
	Image man;
	TargetGroup targetGroup;
	int score = 0;
	
	
    @Override
    public void create() {
        stage = new Stage(480, 320, true);
        LabelStyle labelStyle = new LabelStyle(new BitmapFont(), Color.BLACK); //����һ��Label��ʽ��ʹ��Ĭ�Ϻ�ɫ����
        Label label = new Label("FPS:", labelStyle); //������ǩ����ʾ��������FPS��
        label.setName("fpsLabel"); //���ñ�ǩ����ΪfpsLabel
        label.setY(0); //����YΪ0������ʾ��������
        label.setX(480 - label.getTextBounds().width); //����Xֵ����ʾΪ���һ���ֽ�����Ļ���Ҳ�
        stage.addActor(label); //����ǩ��ӵ���̨
        
        atlas = new TextureAtlas("pack/default.pack");
        man = new Image(atlas.findRegion("Player")); //��ȡͼ���е�Player.png������image����
        man.setOrigin(man.getWidth() / 2, man.getHeight() / 2);
        man.setX(stage.getWidth()/2);
        man.setY(stage.getHeight()/2); //����Yֵ������ͼƬ���м���ʾ
        stage.addActor(man); //��������ӵ���̨
        
        targetGroup = new TargetGroup(atlas.findRegion("Target"),stage);
        stage.addActor(targetGroup);
        for ( int i = 0  ; i < 3 ; ++ i )
        	targetGroup.addTarget(man);
        
        projectiles = new Group();
        stage.addActor(projectiles); //��ӷ����鵽��̨
        
        InputMultiplexer multiplexer = new InputMultiplexer(); //�����������
        multiplexer.addProcessor(this); //���������Ϊ����
        multiplexer.addProcessor(stage); //�����̨
        Gdx.input.setInputProcessor(multiplexer); //���ö����������Ϊ������
    }
 
    @Override
    public void dispose() {
        stage.dispose();
    }

    int counter = 0;
    int blink = 15;
    int blinkMin = 12;
    int blinkMax = 60;
    @Override
    public void render() {
        Gdx.gl.glClearColor(0.8f, 0.8f, 0.8f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
        Label label = (Label) stage.getRoot().findActor("fpsLabel"); //��ȡ��ΪfpsLabel�ı�ǩ
        //label.setText("FPS:" + Gdx.graphics.getFramesPerSecond());
        label.setText("Score:" + score );
        label.setX(stage.getWidth()/2 - label.getTextBounds().width); //����Xֵ�Ա�֤��ʾλ����ȷ��
        label.setY(stage.getHeight()/2+30);
        

        // ��ʼ�������
             Actor[] projectile = projectiles.getChildren().begin();
             Actor[] targets = targetGroup.getChildren().begin();
             for (int i = 0; i < projectiles.getChildren().size; i++) {
                 Actor actor = projectile[i];
                 for (int j = 0; j < targetGroup.getChildren().size; j++) {
                     Actor target = targets[j];
                     if (ProjectileFactory.attackAlive(target, actor)) {
                         targetGroup.removeActor(target);
                         projectiles.removeActor(actor);
                         score+=10;
                         break;
                     }
                 }
             }
             
             for (int j = 0; j < targetGroup.getChildren().size; j++) {
                 Actor target = targets[j];
                 if (ProjectileFactory.attackAlive(target, man)) {
                     targetGroup.removeActor(target);
                     score-=50 + score/5;
                     break;
                 }
             }
             
      
             // ��������Ѿ��ɵ���h��
             projectile = projectiles.getChildren().begin();
             for (int j = 0; j < projectiles.getChildren().size; j++) {
                 Actor actor = projectile[j];
                 if (!ProjectileFactory.checkAlive(actor)) {
                     projectiles.removeActor(actor);
                 }
             }
             counter ++;
             if ( counter >= blink )
             {
            	 counter = 0;
            	 blink = MathUtils.random( blinkMin , blinkMax );
            	 if ( blink == ( blinkMax / 2 ) )
            		 blinkMax--;
            	 targetGroup.addTarget(man);
             }
    }

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        Vector3 target = new Vector3(screenX , screenY , 0);
        stage.getCamera().unproject(target); // ����ת��
        projectiles.addActor(ProjectileFactory.createProjectile( 
        		atlas.findRegion("Projectile"), man, target)  );
        System.out.println(pointer + " " + button);
        return true;
    }
}