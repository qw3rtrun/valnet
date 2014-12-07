package com.github.qw3rtrun.valnet;

import com.github.qw3rtrun.valnet.expr.Expression;

/**
 * Association command.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class AssociateCommand {

    public final String name;

    public final Expression expression;

    public AssociateCommand(String name, Expression expression) {
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
