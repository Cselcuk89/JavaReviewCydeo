package org.Selcuk;

public class AppleClass {
    private int weight;
    private Color color;

    public AppleClass(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AppleClass{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
