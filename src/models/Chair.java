package models;

import java.util.Objects;

public class Chair extends Furniture implements IOffer{
    private Boolean haveWheels;

    public Chair(Integer stock, String name, Double price, Boolean haveWheels) {
        super(stock, name, price, ProductType.CHAIR);
        this.haveWheels = haveWheels;
    }

    public Chair(Boolean haveWheels) {
        this.haveWheels = haveWheels;
    }

    public Boolean getHaveWheels() {
        return haveWheels;
    }

    public void setHaveWheels(Boolean haveWheels) {
        this.haveWheels = haveWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair chair)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(haveWheels, chair.haveWheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), haveWheels);
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nChair{" +
                "haveWheels=" + haveWheels +
                '}';
    }

    @Override
    public Double applyDiscount(Integer percentage) {
        return getPrice()-getPrice()*percentage/100;
    }
}
