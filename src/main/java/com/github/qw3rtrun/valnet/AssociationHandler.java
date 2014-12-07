package com.github.qw3rtrun.valnet;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.AggregateNotFoundException;
import org.axonframework.repository.Repository;

/**
 * Handle all association using repository.
 * <p>
 * Created by qw3rtrun on 06.10.14.
 */
public class AssociationHandler {

    private final Repository<Association> repo;

    public AssociationHandler(Repository<Association> repo) {
        this.repo = repo;
    }

    @CommandHandler
    public void handle(AssociateCommand cmd) {
        try {
            final Association val = repo.load(cmd.getName());
            val.setExpression(cmd.getExpression());
        } catch (AggregateNotFoundException e) {
            repo.add(new Association(cmd.getName(), cmd.getExpression()));
        }
    }


}
