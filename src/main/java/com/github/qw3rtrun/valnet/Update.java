package com.github.qw3rtrun.valnet;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by qw3rtrun on 07.12.14.
 */
public class Update {

    @TargetAggregateIdentifier
    private String name;

    private double value;

    public Update(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
