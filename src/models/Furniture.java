package models;

public abstract class Furniture extends Product{
    public Furniture(Integer stock, String name, Double price, ProductType type) {
        super(stock, name, price, type);
    }

    public Furniture() {
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Furniture";
    }
}
