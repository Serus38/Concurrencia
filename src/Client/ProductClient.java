package Client;

import java.util.List;

/**
 * Clase que determina el cliente que comprara los productos.
 */
public class ProductClient {

    /**
     * Atributo que determina
     */
    private final String name;

    /**
     * Atributo que determina
     */
    private final List<Product> products;

    /**
     * @param name
     * @param products
     */
    public ProductClient(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    /**
     * Metodo encargado de retornar el valor del atibuto name
     *
     * @return El name asociado a la clase
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo encargado de retornar el valor del atibuto products
     *
     * @return El name asociado a la products
     */
    public List<Product> getProducts() {
        return products;
    }
}
