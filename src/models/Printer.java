package models;

import java.util.Objects;

public class Printer extends ComputerProduct implements IOffer{
    private Integer printsForMinute;

    public Printer(Integer stock, String name, Double price, String manufacturer, Integer printsForMinute) {
        super(stock, name, price, ProductType.PRINTER, manufacturer);
        this.printsForMinute = printsForMinute;
    }

    public Printer() {
    }

    public Integer getPrintsForMinute() {
        return printsForMinute;
    }

    public void setPrintsForMinute(Integer printsForMinute) {
        this.printsForMinute = printsForMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Printer printer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(printsForMinute, printer.printsForMinute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), printsForMinute);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nPrinter" +
                "\nprintsForMinute: " + printsForMinute;
    }

    @Override
    public Double applyDiscount(Integer percentage) {
        return getPrice()-getPrice()*percentage/100;
    }
}
