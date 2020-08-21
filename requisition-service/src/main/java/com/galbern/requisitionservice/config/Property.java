package com.galbern.requisitionservice.config;


public class Property {
    int minimum;
    int maximum;

    public Property(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Property() {
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
