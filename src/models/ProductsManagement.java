package models;

import java.util.ArrayList;
import java.util.List;

public class ProductsManagement {

    private List<Product> products;

    public ProductsManagement(List<Product> productos) {
        this.products = productos;
    }

    public ProductsManagement() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        //Como la clase tiene un constructor vacio,
        // me aseguro que el array este inicializado
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(product);
    }


    public void updatePrice() {
        for (Product product : products) {
            Double newPrice = 0d;
            System.out.println(product.getType());
            System.out.println("precio original: $" + product.getPrice());
            switch (product.getType()) {
                case DESK:
                    newPrice = product.getPrice() + product.getPrice() * 0.1;
                    break;
                case CHAIR:
                    newPrice = product.getPrice() + product.getPrice() * 0.05;
                    break;
                case PRINTER:
                    newPrice = product.getPrice() + product.getPrice() * 0.15;
                    break;
                case NOTEBOOK:
                    newPrice = product.getPrice() + product.getPrice() * 0.2;
                    break;
            }

            System.out.println("precio Aumentado: $" + newPrice);
        }


        /*
        Se debe indicar por parámetro
el porcentaje de descuento y retornar el precio del producto con el descuento aplicado.
Se tendrá en
cuenta la forma en que solucionan este punto
         */
    }


    public Double getOfferPrice(IOffer productInOffer, Integer discount)
    {
        return productInOffer.applyDiscount(discount);
    }
}
