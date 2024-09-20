package models;

import java.util.Objects;

public abstract class Product {
    private Integer stock;
    private String name;
    private Double price;

    private ProductType type;

    public Product(Integer stock, String name, Double price, ProductType type) {
        this.stock = stock;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Product() {
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(stock, product.stock) && Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stock, name, price);
    }

    @Override
    public String toString() {
        return "\nProduct: " + name +
                "\nStock:" + stock +
                "\nPrice=" + price;
    }
}
