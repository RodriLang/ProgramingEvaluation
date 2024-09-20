import models.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ProductsManagement manager = new ProductsManagement();


        //Esta silla la instacio aparte porque la voy a usar en el descuento
        Chair chair1 = new Chair(24, "Silla Gamer", 245000.00, false);

        manager.addProduct(new Notebook(5, "IdeaPad", 1233999.00, "Lenovo" , 32));
        manager.addProduct(new Printer(17, "PrintMax", 456000.00, "Xerox" , 25));
        manager.addProduct(chair1);
        manager.addProduct(new Desk(12, "Escritorio Negro", 446800.00, 1.10, 0.6));


        for (Product product: manager.getProducts()) {
            System.out.println(product.getClass());
        }

        manager.updatePrice();


       //aplico descuentos

        System.out.println("Precio de la silla: "+chair1.getPrice());
        System.out.println("precio con 20% de decuento: " +manager.getOfferPrice(chair1, 20));


    }


}