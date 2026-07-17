import java.util.ArrayList;   //para el historial
import java.util.ArrayDeque;  //para la cola FIFO

//Clase Cafeteria - gestiona la cola de clientes (FIFO) y el historial
public class Cafeteria {
    //Atributos privados
    private ArrayDeque<Cliente> colaPedidos; //cola FIFO de clientes esperando
    private ArrayList<Cliente> historial;    //clientes ya atendidos

    //Constructor - inicializa cola y lista vacias
    public Cafeteria() {
        this.colaPedidos = new ArrayDeque<>();
        this.historial = new ArrayList<>();
    }

    //Getters (por si los necesitamos desde fuera)
    public ArrayDeque<Cliente> getColaPedidos() {
        return this.colaPedidos;
    }

    public ArrayList<Cliente> getHistorial() {
        return this.historial;
    }

    //Mete al cliente al final de la cola (FIFO)
    public void nuevoCliente(Cliente c) {
        this.colaPedidos.add(c);
        System.out.println("Cliente " + c.getNombre() + " añadido a la cola.");
    }

    //Saca al primero de la cola y lo mete en el historial
    public void atenderSiguiente() {
        if (this.colaPedidos.isEmpty()) {
            System.out.println("No hay clientes en la cola.");
            return;
        }
        Cliente atendido = this.colaPedidos.poll(); //poll() saca y devuelve el primero
        this.historial.add(atendido);
        System.out.println("Atendido: " + atendido);
    }

    //Imprime cola actual + historial completo
    public void mostrarEstado() {
        System.out.println("------ Estado de la cafetería ------");
        System.out.println("Cola de pedidos: " + this.colaPedidos);
        System.out.println("Historial: " + this.historial);
        System.out.println("------------------------------------");
    }
}
