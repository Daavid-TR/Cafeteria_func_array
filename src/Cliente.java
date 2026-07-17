//Clase Cliente - representa a un cliente con su pedido
public class Cliente {
    //Atributos privados
    private String nombre;
    private String pedido;

    //Constructor
    public Cliente(String nombre, String pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getPedido() {
        return this.pedido;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    //toString para imprimir bien al cliente
    @Override
    public String toString() {
        return nombre + " -> " + pedido;
    }
}
