package edu.aram4illinois.wildhacks;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Abdul on 11/19/16.
 */

public class Order implements Serializable {
    private String name;
    private String mealName;
    private double estimatedTime;

    public Order(String name, String mealName, double estimatedTime) {
        this.name = name;
        this.mealName = mealName;
        this.estimatedTime = estimatedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
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
                ", mealName='" + mealName + '\'' +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}