import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cafeteria miCafeteria = new Cafeteria();

        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        System.out.println("Bienvenido a la cafetería 'El Despertar'");

        while (!salir) {

            System.out.println("\n¿Qué quieres hacer?");

            System.out.println("1) Añadir nuevo cliente");

            System.out.println("2) Atender al siguiente cliente");

            System.out.println("3) Ver estado de la cafetería");

            System.out.println("0) Salir");

            int opcion = sc.nextInt();

            sc.nextLine(); //limpia el buffer despues del nextInt()

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del cliente: ");

                    String nombre = sc.nextLine();

                    System.out.println("Pedido: ");

                    String pedido = sc.nextLine();

                    Cliente c = new Cliente(nombre, pedido);

                    miCafeteria.nuevoCliente(c);

                    break;

                case 2:
                    miCafeteria.atenderSiguiente();
                    break;
                case 3:
                    miCafeteria.mostrarEstado();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
