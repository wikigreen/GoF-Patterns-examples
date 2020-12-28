package com.hrynevych.designpatterns.behavioral.interpreter;

public class DecimalExpression implements Expression {
    private final String context;
    private final NumeralSystems numeralSystem;
    private final int position;

    public DecimalExpression(NumeralSystems numeralSystems, String context, int position) {
        this.position = position;
        this.context = context;
        this.numeralSystem = numeralSystems;
    }

    public DecimalExpression(int number) {
        this.context = "" + number;
        this.numeralSystem = null;
        position = 0;

    }

    @Override
    public int interpret() {
        if(numeralSystem == null)
            return Integer.parseInt(context);
        if(!context.matches("[0-" + (numeralSystem.getOdd() - 1) +"]")){
            throw new IllegalArgumentException("'" + context + "' can not be processed");
        }
        return Integer.parseInt(context) * (int) Math.pow(numeralSystem.getOdd(), position);
    }
}
