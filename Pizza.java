public class Pizza {

    private boolean ordenLista;
   

    public Pizza(String tipoSalsa, String tipoBase) {
        this.tipoSalsa = tipoSalsa;
        this.tipoBase = tipoBase;
        this.ordenLista = false;
    }

    public void anadirIngrediente(Toppings[0] toppings) {
        this.toppings = toppings;
    }
    
    public void anadirIngrediente(Toppings[1] toppings, Toppings[0] toppings) {
        this.toppings = toppings;
    }

    public void anadirIngrediente(Toppings[] toppings) {
        this.toppings = toppings;
    }

    public boolean mostrarEstado(boolean ordenLista) {
        this.ordenLista = ordenLista;
        return this.ordenLista;
    }
}