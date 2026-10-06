public class Cocina {

    private Orden[] orden;
    private Toppings[] topping;
    private String nombreCliente;
    private String tipoSalsa;
    private String tipoBase;

    public Cocina(Orden[] orden) {
        this.orden = orden;
    }

    public boolean prepararIngredientes(Toppings[] topping) {

        this.topping = topping;

        System.out.println("Preparando ingredientes...");

        return true;
    }

    public boolean prepararBase(String tipoBase) {

        this.tipoBase = tipoBase;

        System.out.println("Preparando base: " + tipoBase);

        return true;
    }

    public boolean prepararSalsa(String tipoSalsa) {

        this.tipoSalsa = tipoSalsa;

        System.out.println("Preparando salsa: " + tipoSalsa);

        return true;
    }
}