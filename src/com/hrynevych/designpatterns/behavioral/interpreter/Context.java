package com.hrynevych.designpatterns.behavioral.interpreter;

public class Context {
    public Expression evaluate(String context, NumeralSystems numeralSystems){
        if(context.length() == 0)
            return new DecimalExpression(0);
        Expression left = new DecimalExpression(numeralSystems, context.substring(0, 1), context.length() - 1);
        Expression right = evaluate(context.substring(1), numeralSystems);
        return new AddExpression(left, right);
    }
}
