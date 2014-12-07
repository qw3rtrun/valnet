package com.github.qw3rtrun.valnet;

import com.github.qw3rtrun.valnet.expr.Expression;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

/**
 * Main aggregate is Association, that represented single node of Valnet.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class Association extends AbstractAnnotatedAggregateRoot<String> {

    @AggregateIdentifier
    private String name;

    private Expression expression;

    public Association() {
    }

    public Association(String name, Expression expression) {
        apply(new AssociateEvent(name, expression));
    }

    public void setExpression(Expression expression) {
        apply(new AssociateEvent(name, expression));
    }

    public String getName() {
        return name;
    }

    @EventHandler
    protected void onAssociate(AssociateEvent event) {
        this.name = event.getName();
        this.expression = event.getExpression();
    }
}

