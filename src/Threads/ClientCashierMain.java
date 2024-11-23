package Threads;

import Client.Product;
import Client.ProductClient;

import java.util.ArrayList;
import java.util.List;

public class ClientCashierMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        setProducts(products);

        ProductClient clientOne = new ProductClient(" George ", products);
        ProductClient clientTwo = new ProductClient(" Maria ", products);
        ProductClient clientThree = new ProductClient(" Edelmira ", products);
        ProductClient clientFour = new ProductClient(" Sebastian ", products);
        ProductClient clientFive = new ProductClient(" Maritza ", products);


        long initialTime = System.currentTimeMillis();
        ProductCashier cashierOne = new ProductCashier(" Julia ", clientOne, initialTime);
        ProductCashier cashierTwo = new ProductCashier(" Baneza ", clientTwo, initialTime);
        ProductCashier cashierThree = new ProductCashier(" Pepita Perez ", clientThree, initialTime);

        cashierOne.start();
        cashierTwo.start();
        cashierThree.start();
    }

    /**
     * @param products
     */
    public static void setProducts(List<Product> products) {
        Product productOne = new Product(2000," Arroz   ",5 );
        Product productTwo = new Product(5000," Papa ",2 );
        Product productThree = new Product(1500," Sal ",2 );
        Product productFour = new Product(4000," Salchicha ",3 );
        Product productFive = new Product(9000," Aceite ",1 );

        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
        products.add(productFour);
        products.add(productFive);


    }
}
