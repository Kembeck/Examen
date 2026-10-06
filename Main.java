public class Main {
    public static void main(String[] args) {

        Orden orden = new Orden();

        orden.mostrarMenu();

        String nombreCliente = orden.getNombreCliente();
        String tipoSalsa = orden.getTipoSalsa();
        Toppings[] toppings = orden.getToppings();

        Pizza pizza = new Pizza(tipoSalsa, "Mozzarella");

        pizza.anadirIngrediente(toppings);

        Orden[] ordenes = {orden};

        Cocina cocina = new Cocina(ordenes);

        cocina.prepararBase("Tradicional");
        cocina.prepararSalsa(tipoSalsa);
        cocina.prepararIngredientes(toppings);

        boolean lista = pizza.mostrarEstado(true);

        System.out.println("\n===== ORDEN =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Salsa: " + tipoSalsa);

        System.out.println("Toppings:");
        for (Toppings topping : toppings) {
            System.out.println("- " + topping);
        }

        if (lista) {
            System.out.println("La pizza esta lista.");
        } else {
            System.out.println("La pizza aun no esta lista.");
        }
    }
}
