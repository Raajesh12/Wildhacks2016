package edu.aram4illinois.wildhacks;

import android.os.CountDownTimer;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Abdul on 11/19/16.
 */

public class Order implements Serializable {
    private String name;
    private String displayName;
    private int orderNumber;
    private double estimatedTime;

    public Order(String name, int aNumber, double estimatedTime) {
        this.name = name;
        if (name.length() >= 10)
            this.displayName = name.substring(0, 10);
        else
            this.displayName = name;
        this.orderNumber = aNumber;
        this.estimatedTime = estimatedTime;
    }

    public String getDisplayName(){return displayName;}

    public void setDisplayName(String aDisplayName){this.displayName = aDisplayName;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int aNumber) {
        this.orderNumber = aNumber;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}