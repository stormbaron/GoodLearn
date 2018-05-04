package com.baronli.learn.mylearning.data.db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.baronli.learn.mylearning.R;
import com.baronli.learn.mylearning.data.entity.Order;
import com.baronli.learn.mylearning.data.entity.OrderMapper;

import java.util.List;

/**
 * @author juli
 */
public class DBShowActivity extends AppCompatActivity {

    private TextView textView;
    List<Order> orders;
    Order order;

    public long start=500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbshow);
        textView = (TextView) findViewById(R.id.textView2);
        orders = OrderMapper.finOrders();
        if (orders != null) {
            textView.setText("" + orders.toString());
        }


        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order = new Order();
                order.setId((int)(Math.random()*Math.random()*1000000));
                order.setName("Order:" + Math.random());
                Log.i("DBShowActivity","" + order.toString());
                OrderMapper.insert(order);
                orders = OrderMapper.finOrders();
                if (orders != null) {
                    textView.setText("" + orders.toString());
                }
            }
        });

    }
}