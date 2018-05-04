package com.baronli.learn.mylearning.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.baronli.learn.mylearning.R;

/**
 * @author juli
 *         <p>
 *         animation测试
 */
public class Animation2Activity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);
        imageView = (ImageView) findViewById(R.id.imageView2);
        /**
         *
         */
        imageView.animate().alpha((float) 0.50).scaleX(10).scaleY(10).setDuration(3000).translationX(10).start();

        //imageView.animate().alpha((float) 0.50).scaleX(0).scaleY(0).setDuration(3000).translationX(0).start();
    }
}
