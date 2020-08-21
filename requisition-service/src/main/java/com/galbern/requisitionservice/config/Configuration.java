package com.galbern.requisitionservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("requisition-service")
public class Configuration {
    int minimum;
    int maximum;

    public Configuration(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Configuration() {
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
