
package com.game;
 
import java.util.Random;

import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
 
public class TargetGroup extends Group {
	
	AtlasRegion region;
	Stage stage;
	float count;
	float minTime = 3f;
	float maxTime = 5f;
    public TargetGroup(AtlasRegion region , Stage stage) {
        super();
        this.region = region;
        this.stage = stage;
        
    }
    public void addTarget( Image man ){
        int minY = 0;
        int maxY = (int) (320 - region.getRegionHeight());
       // int tempY = MathUtils.random(minY, maxY);       

        Image image = new Image(region);
        
        int tempY = 0;
        int tempX = 0;
        int tem = MathUtils.random(0,3);
        if ( tem == 0 ){
        	image.setX(0);
        	image.setY(MathUtils.random(0,stage.getHeight()));
        }else if ( tem == 1 ){
        	image.setX(stage.getWidth());
        	image.setY(MathUtils.random(0,stage.getHeight()));
        	
        }else if (tem == 2 ) {
        	image.setY(0);
        	image.setX(MathUtils.random(0,stage.getWidth()));
			 
		}else {

        	image.setY(stage.getHeight());
        	image.setX(MathUtils.random(0,stage.getWidth()));
		}
            // ��ʼ�ж�Yֵ�Ƿ����Ҫ��
            boolean flag = false;
            /*do {
                flag = false;
                tempY = MathUtils.random(minY, maxY); // ����Yֵ
 
                Actor[] actors = this.getChildren().begin(); // ��ȡ��ǰ���еĹ��޶���
                for (int j = 0; j < this.getChildren().size; j++) {
                    Actor tempActor = actors[j];
                    if (tempY == tempActor.getY()) { // ���Yֵ��ȣ������غϣ���������,��������
                        flag = true;
                        break;
                    } else if (tempY < tempActor.getY()) { // ������ɵ�YֵС�ڵ�ǰ���޵�Yֵ�����ж����ɵ�Yֵ���ϸ߶Ⱥ��Ƿ����
                        if ((tempY + region.getRegionHeight()) >= tempActor
                                .getY()) {
                            flag = true;
                            break;
                        }
                    } else { // ������ɵ�Yֵ���ڵ�ǰ���޵�Yֵ�����жϵ�ǰ���޵�Yֵ���ϸ߶Ⱥ��Ƿ����
                        if (tempY <= (tempActor.getY() + region
                                .getRegionHeight())) {
                            flag = true;
                            break;
                        }
                    }
                }
            } while (flag);*/
            this.AddMove(image, man , MathUtils.random( minTime / ( 1 + count / 25 ) , maxTime / ( 1 + count / 50 )));
            this.addActor(image); //��ӵ�����
            count ++;
    }

    public void AddMove(Actor actor, Actor man ,  float time) {
        actor.addAction(Actions.moveTo(man.getX(), man.getY() , time));
    }
}