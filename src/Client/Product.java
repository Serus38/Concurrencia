package Client;

/**
 * Clase que determina los productos comprados por el cliente
 *
 *
 */
public class Product {

    /**
     * Nombre del producto
     */
    private String name;

    /**
     * Precio del producto
     */
    private float price;

    /**
     * Cantidad del producto
     */
    private int count;


    /**
     * @param price
     * @param name
     * @param count
     */
    public Product(float price, String name, int count) {
        this.price = price;
        this.name = name;
        this.count = count;
    }

    /**
     * Metodo encargado de retotnar el valor del atributo name
     *
     * @return El nombre asociado a la clase
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo encargado de modificar el valor del atributo name
     *
     * @param name El nuevo name a modificar
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo encargado de retornar el valor del atibuto price
     *
     * @return El precio asociado a la clase
     */
    public float getPrice() {
        return price;
    }
    /**
     * Metodo encargado de modificar el valor del atributo price
     *
     * @param price El nuevo name a modificar
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Metodo encargado de retornar el valor del atibuto count
     *
     * @return El count asociado a la clase
     */
    public int getCount() {
        return count;
    }
    /**
     * Metodo encargado de modificar el valor del atributo count
     *
     * @param count El nuevo name a modificar
     */
    public void setCount(int count) {
        this.count = count;
    }
}
