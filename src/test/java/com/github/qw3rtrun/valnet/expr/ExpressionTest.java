package com.github.qw3rtrun.valnet.expr;


import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ExpressionTest {

    @Test
    public void test() {
        Operation subOperation = new Operation((x, y) -> x * y, asList(new Var("a"), new Const(2.0)), 1);
        Operation operation = new Operation((x, y) -> x + y, asList(new Const(12), new Const(32), new Const(25), new Var("a"), subOperation));
        assertEquals(1, operation.parameters().size());
        assertTrue(operation.parameters().contains("a"));
        assertEquals(72.0, operation.eval(Collections.singletonMap("a", 1.0)));
    }
}

