package models;

import java.util.Objects;

public class Desk extends Furniture{
    private Double width;
    private Double height;

    public Desk(Integer stock, String name, Double price, Double width, Double height) {
        super(stock, name, price, ProductType.DESK);
        this.width = width;
        this.height = height;
    }

    public Desk() {
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desk desk)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(width, desk.width) && Objects.equals(height, desk.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Desk{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
