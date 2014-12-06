package com.github.qw3rtrun.valnet.expr;

import java.util.Collection;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Operation implements Expression {
    private final BiFunction<Double, Double, Double> function;
    private final double initValue;
    private final Collection<Expression> operands;

    public Operation(BiFunction<Double, Double, Double> function, Collection<Expression> operands) {
        this(function, operands, 0);
    }

    public Operation(BiFunction<Double, Double, Double> function, Collection<Expression> operands, double initValue) {
        this.function = function;
        this.initValue = initValue;
        this.operands = operands;
    }

    @Override
    public double eval(Map<String, Double> context) {
        double reduced = initValue;
        for (Expression operand : operands) reduced = function.apply(reduced, operand.eval(context));
        return reduced;
    }

    @Override
    public Collection<String> parameters() {
        return operands.stream().<String>flatMap((o) -> o.parameters().stream()).collect(Collectors.toSet());
    }
}
