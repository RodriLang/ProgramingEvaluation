package models;

import java.util.Objects;

public abstract class ComputerProduct extends Product{
    private String manufacturer;

    public ComputerProduct(Integer stock, String name, Double price, ProductType type, String manufacturer) {
        super(stock, name, price, type);
        this.manufacturer = manufacturer;
    }

    public ComputerProduct() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerProduct that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer);
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "ComputerProduct" +
                "\nmanufacturer:" + manufacturer;
    }
}
