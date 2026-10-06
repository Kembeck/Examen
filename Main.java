public class Main {

    public static void main(String[] args) {

        Orden orden = new Orden();

        String nombreCliente = "";
        String tipoSalsa = "";
        Toppings[] toppings = null;
        Pizza pizza = null;

        int opcion;

        do {

            opcion = orden.mostrarMenu();

            switch (opcion) {

                case 1:

                    System.out.println("\n===== CREAR PIZZA =====");

                    nombreCliente = orden.getNombreCliente();
                    tipoSalsa = orden.getTipoSalsa();
                    toppings = orden.getToppings();

                    pizza = new Pizza(tipoSalsa, "Mozzarella");

                    pizza.anadirIngrediente(toppings);

                    Orden[] ordenes = {orden};

                    Cocina cocina = new Cocina(ordenes);

                    cocina.prepararBase("Tradicional");
                    cocina.prepararSalsa(tipoSalsa);
                    cocina.prepararIngredientes(toppings);

                    pizza.mostrarEstado(true);

                    System.out.println("\nPizza creada correctamente.");
                    break;


                case 2:

                    if (pizza == null) {

                        System.out.println("\nPrimero debe crear una pizza.");

                    } else {

                        System.out.println("\n===== ORDEN =====");
                        System.out.println("Cliente: " + nombreCliente);
                        System.out.println("Salsa: " + tipoSalsa);
                        System.out.println("Queso: " + pizza.getTipoQueso());

                        System.out.println("Toppings:");

                        for (Toppings topping : toppings) {
                            System.out.println("- " + topping);
                        }

                        System.out.println("La pizza esta lista.");
                    }

                    break;


                case 3:

                    System.out.println("\nSaliendo del programa...");
                    break;


                default:

                    System.out.println("\nOpcion incorrecta.");
                    break;
            }

        } while (opcion != 3);
    }
}