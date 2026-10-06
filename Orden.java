import java.util.Scanner;

public class Orden {

    private Scanner scanner;

    public Orden() {
        scanner = new Scanner(System.in);
    }

    public void mostrarInfo() {
        System.out.println("Informacion de la orden");
    }

    public String getNombreCliente() {

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();

        return nombre;
    }

    public String getTipoSalsa() {

        System.out.println("\n===== SALSAS =====");
        System.out.println("1. Tomate");
        System.out.println("2. Barbacoa");
        System.out.println("3. Alfredo");

        System.out.print("Seleccione una salsa: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            return "Tomate";

        } else if (opcion == 2) {
            return "Barbacoa";

        } else if (opcion == 3) {
            return "Alfredo";

        } else {
            return "Tomate";
        }
    }

    public Toppings[] getToppings() {

        System.out.println("\n===== TOPPINGS =====");
        System.out.println("1. Jamon");
        System.out.println("2. Pepperoni");
        System.out.println("3. Chile Pimiento");

        System.out.print("Cuantos toppings quiere: ");
        int cantidad = scanner.nextInt();

        
        Toppings[] toppings = new Toppings[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nElija el topping " + (i + 1));
            System.out.println("1. Jamon");
            System.out.println("2. Pepperoni");
            System.out.println("3. Chile Pimiento");

            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {

                toppings[i] = Toppings.JAMON;

            } else if (opcion == 2) {

                toppings[i] = Toppings.PEPPERONI;

            } else if (opcion == 3) {

                toppings[i] = Toppings.CHILE_PIMIENTO;

            } else {

                System.out.println("Opcion invalida, intente otra vez.");

                i--;
            }
        }

        scanner.nextLine();

        return toppings;
    }

    public int mostrarMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Crear pizza");
        System.out.println("2. Mostrar orden");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
}
}