package com.github.qw3rtrun.valnet;

import com.github.qw3rtrun.valnet.expr.Expression;

/**
 * Association event.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class AssociateEvent {

    private final String name;
    private final Expression expression;

    public AssociateEvent(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
}
