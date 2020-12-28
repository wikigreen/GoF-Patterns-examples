package com.hrynevych.designpatterns.behavioral.interpreter;

public class Parser {
    public static void main(String[] args) {
        String binary = "71201237";
        int parseInt = Integer.parseInt(binary, 8);
        System.out.println("java.util.Integer.parseInt() : " + parseInt);
        Context context = new Context();
        int interpret = context.evaluate(binary, NumeralSystems.OCTAL).interpret();
        System.out.println("My interpreter: " + interpret);
    }
}
