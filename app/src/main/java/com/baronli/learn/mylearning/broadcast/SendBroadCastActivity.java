package com.baronli.learn.mylearning.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.baronli.learn.mylearning.R;

/**
 * @author juli
 *         <p>
 *         Action:
 *         在发送广播时,必须匹配action,其中Receiver必须包含action,Receiver可以包含一个或一个以上的action,而在sendBroadcast时
 *         Intent中携带的action必须是子集(不能为空,都必须至少有一个),也就是如果Receiver没有action,则无法接收任何广播,Intent不携带action的话也不会被任何
 *         Receiver接收
 *         <p>
 *         Categroy
 *         Category也必须是子集(可以是空,两者都是空,或者Intent中是空),也就是说Category是一个可选项,但如果有了的话,Intent中携带的必须是Receiver的子集
 *         <p>
 *         有序和无序
 *         无序:广播发出的时候所有可以接收的接收器部分先后可以同时接收到此广播
 *         有序:广播的接受者存在先后顺序,接收级别高的可以拦截广播使广播不在继续往下传递
 *         <p>
 *         应用程序内部的广播建议使用LocalBroadcastManager#sendBroadcast()
 *         将广播限制在应用内部
 *         Context#sendBroadcast()发出的广播是全局广播
 *         <p>
 *         <p>
 *         BroadcastReceiver#onReceive()中不可以执行耗时操作
 */
public class SendBroadCastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broad_cast);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("baron.button");
                intent.setAction("baron.button3");

                intent.addCategory("baron.category.one");
                intent.putExtra("Test", "TESt");
                sendBroadcast(intent);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("baron.button");
                intent.putExtra("Test", "TESt");
                sendOrderedBroadcast(intent, "test");
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Test", "TESt");
                sendBroadcast(intent, "test");
            }
        });
    }

    public String getPacName() {
        return "Baron";
    }
}
