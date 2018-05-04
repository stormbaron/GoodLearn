package com.baronli.learn.mylearning.data.entity;

import com.baronli.learn.mylearning.app.APP;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;

/**
 * @author juli
 * @date 18/4/18
 */

public class OrderMapper {
    public static List<Order> finOrders() {
        return APP.getInstances().getDaoSession().getOrderDao().queryBuilder().list();
    }

    public static long insert(Order order) {
        return APP.getInstances().getDaoSession().getOrderDao().insert(order);
    }
}
