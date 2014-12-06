package com.github.qw3rtrun.valnet.expr;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Var implements Expression {

    private final String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public double eval(Map<String, Double> context) {
        return context.get(name);
    }

    @Override
    public Collection<String> parameters() {
        return Collections.singleton(name);
    }
}
