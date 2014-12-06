package com.github.qw3rtrun.valnet.expr;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Const implements Expression {
    private final double constant;

    public Const(double constant) {
        this.constant = constant;
    }

    @Override
    public double eval(Map<String, Double> context) {
        return constant;
    }

    @Override
    public Collection<String> parameters() {
        return Collections.emptyList();
    }
}
