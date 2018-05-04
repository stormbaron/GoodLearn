package com.baronli.learn.mylearning.data.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author juli
 * @date 18/4/18
 */
@Entity
public class Order {
    @Id
    private long id;
    private String name;

    @Generated(hash = 65995420)
    public Order(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1105174599)
    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Id:"+id+";name:"+name;
    }

}
