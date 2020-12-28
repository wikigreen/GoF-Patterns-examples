package com.hrynevych.designpatterns.structural.flyweight;

public class RgbColor implements Color {
    private int red;
    private int green;
    private int blue;

    public RgbColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String getChart() {
        return "RGB color chart: red - " + red + ", green - " + green + ", blue - " + blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RgbColor rgbColor = (RgbColor) o;

        if (red != rgbColor.red) return false;
        if (green != rgbColor.green) return false;
        return blue == rgbColor.blue;
    }

    @Override
    public int hashCode() {
        int result = red;
        result = 31 * result + green;
        result = 31 * result + blue;
        return result;
    }
}