package com.github.qw3rtrun.valnet.expr;

import java.util.Collection;
import java.util.Map;

public interface Expression {
    public double eval(Map<String, Double> context);

    public Collection<String> parameters();
}
