package com.github.qw3rtrun.valnet;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

/**
 * Main aggregate is Value, that represented single node of Valnet.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class Value extends AbstractAnnotatedAggregateRoot<String> {

    @AggregateIdentifier
    private String name;

    private double value;

    public Value() {
    }

    public Value(String name, double value) {
        apply(new AssociateEvent(name, value));
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        apply(new AssociateEvent(getName(), value));
    }

    @EventHandler
    protected void onAssociate(AssociateEvent event) {
        this.name = event.getName();
        this.value = event.getValue();
    }

    @Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

