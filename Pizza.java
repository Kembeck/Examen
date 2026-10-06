public class Pizza {

    private boolean ordenLista;
    private String tipoSalsa;
    private String tipoQueso;
    private Toppings[] toppings;

    public Pizza(String tipoSalsa, String tipoQueso) {
        this.tipoSalsa = tipoSalsa;
        this.tipoQueso = tipoQueso;
        this.ordenLista = false;
    }

    public void anadirIngrediente(Toppings[] toppings) {
        this.toppings = toppings;
    }

    public boolean mostrarEstado(boolean ordenLista) {
        this.ordenLista = ordenLista;
        return this.ordenLista;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Toppings[] getToppings() {
        return toppings;
    }
}

