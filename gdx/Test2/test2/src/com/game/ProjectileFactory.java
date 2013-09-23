package com.game;

import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class ProjectileFactory {
	
	public final static float speed = 150f;
	public final static float MaxFlyTime = 5f;
	public static Image createProjectile(AtlasRegion region, Actor man,
            Vector3 target) {
        Image image = new Image(region);
        image.setOrigin(image.getWidth() / 2, image.getHeight() / 2);
        image.setX(man.getX() + man.getWidth() / 2);
        image.setY(man.getY() + man.getHeight() / 2);
        
        Vector3 toward = new Vector3( target.x - man.getX() - region.getRegionWidth() , target.y - man.getY() - region.getRegionHeight() , 0);
        toward.nor();
        
        image.addAction(Actions.moveTo( toward.x*500 + man.getX()  , toward.y*500 + man.getY() , MaxFlyTime)); //设置飞镖的移动
        image.addAction(Actions.repeat(50, Actions.rotateBy(360, 0.5f))); //设置飞镖的旋转
        return image;
    }
	
	public static Boolean checkAlive(Actor projectile) {
        if (projectile.getActions().size == 1) {
            return false;
        }
        return true;
    }
	

public static Boolean attackAlive(Actor target, Actor projectile) {
        Rectangle rectangle = new Rectangle(target.getX(), target.getY(),
                target.getWidth(), target.getHeight()); // 创建一个矩形
        return rectangle.contains(
                projectile.getX() + projectile.getWidth() / 2,
                projectile.getY() + projectile.getHeight() / 2); //判断是否在矩阵中，即是否击中
    }
}
