package com.baronli.learn.mylearning.animation;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.baronli.learn.mylearning.R;

/**
 * @author juli
 *         Animation 测试
 */
public class AnimationActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imageView = (ImageView) findViewById(R.id.imageView);
        /**
         * 帧动画,相当于一种图片资源
         * 按照设定的规则不断播放下一张图片
         */
        imageView.setImageResource(R.drawable.images_animator);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();


        RotateAnimation();

        RotateAnimator();

        AlpahAnimator();
        /**
         * Activity在进行进入和转出时的动画
         */
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right);
    }

    private void RotateAnimation() {
        /**
         * 补间动画  Animation是核心,主要进行缩放\移动\旋转\渐变
         */
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.images_animator2);
        animation.setRepeatCount(-1);
        imageView.startAnimation(animation);
    }


    private void RotateAnimator() {
        /**
         * 属性动画 ObjectAnimator是核心,主要针对View的属性,对属性进行修改
         */
        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f);
        anim.setDuration(5000);
        anim.setRepeatCount(-1);
        anim.start();
    }

    private void AlpahAnimator() {
        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.0f);
        anim.setRepeatCount(-1);
        anim.setRepeatMode(ObjectAnimator.REVERSE);
        anim.setDuration(5000);
        anim.start();
    }
}
