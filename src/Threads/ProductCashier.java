package Threads;

import Client.Product;
import Client.ProductClient;

/**
 * Clase que determina el proceso con hilos de la compra en el supermercado
 *
 */
public class ProductCashier extends Thread {

    /**
     *  Atributo que determina el nombre de la cajera
     */
    private String name;

    /**
     * Atributo que determina el cliente que se le va a procesar la compra
     */
    private ProductClient client;

    /**
     *Atributo que determina el tiempo de compra.
     */
    private long initialTime;

    /**
     * @param name
     * @param client
     * @param initialTime
     */
    public ProductCashier(String name, ProductClient client, long initialTime ) {
        this.name = name;
        this.client = client;
        this.initialTime = initialTime;
    }

    public void run() {
        System.out.println("La cajera = " + this.name
                + " empieza a procesae la compra del cliente "
                + client.getName() + " en el tiempo "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg ");

        int countClient = 1;
        for (Product product : client.getProducts()) {
            this.waitXSeconds();
            System.out.println("Procesando el producto " + countClient
                    + " nombre producto " + product.getName()
                    + " precio del producto " + product.getPrice()
                    + " cantidad de productos " + product.getCount()
                    + " costo del producto " + product.getCount() * product.getPrice()
                    + "Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
            countClient++;
        }
        System.out.println("La cajera " + this.name + " ha terminado de procesar "
        + this.client.getName() + " en el tiempo "
        + (System.currentTimeMillis() - initialTime) / 1000 + " seg");


    }

    /**
     * Calcular el tiempo en lo que demora el proceso.
     */
    private void waitXSeconds() {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


}
