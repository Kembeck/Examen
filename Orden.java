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
        return scanner.nextLine();
    }

    public String getTipoSalsa() {
        System.out.print("Ingrese tipo de salsa: ");
        return scanner.nextLine();
    }

    public Toppings[] getToppings() {
        Toppings[] toppings = {
            Toppings.JAMON,
            Toppings.PEPPERONI
        };

        return toppings;
    }

    public void mostrarMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Crear pizza");
        System.out.println("2. Mostrar orden");
        System.out.println("3. Salir");
    }
}