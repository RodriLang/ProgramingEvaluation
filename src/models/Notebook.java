package models;

import java.util.Objects;

public class Notebook extends ComputerProduct{
    private Integer RamMemory;

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer ramMemory) {
        super(stock, name, price,ProductType.NOTEBOOK, manufacturer);
        RamMemory = ramMemory;
    }

    public Notebook() {
    }

    public Integer getRamMemory() {
        return RamMemory;
    }

    public void setRamMemory(Integer ramMemory) {
        RamMemory = ramMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(RamMemory, notebook.RamMemory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), RamMemory);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNotebook{" +
                "RamMemory=" + RamMemory +" gb"+
                '}';
    }
}
