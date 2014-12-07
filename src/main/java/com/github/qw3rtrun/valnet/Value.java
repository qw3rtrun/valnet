package com.github.qw3rtrun.valnet;

/**
 * Created by qw3rtrun on 07.12.14.
 */
public class Value {
    private String name;
    private double value;

    public Value() {
    }

    public Value(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
