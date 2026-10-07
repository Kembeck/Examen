import javax.swing.*;
import java.awt.*;

public class Interfaz {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Orden");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel campos = new JPanel(new GridLayout(4, 2, 5, 5));
        campos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField nombre = new JTextField();

        JComboBox<String> salsa = new JComboBox<>(
            new String[]{"Tomate", "Barbacoa", "Alfredo"}
        );

        JComboBox<String> base = new JComboBox<>(
            new String[]{"Tradicional", "Delgada", "Gruesa"}
        );

        JCheckBox jamon = new JCheckBox("Jamon");
        JCheckBox pepperoni = new JCheckBox("Pepperoni");
        JCheckBox chilePimiento = new JCheckBox("Chile Pimiento");

        JPanel panelToppings = new JPanel(
            new FlowLayout(FlowLayout.LEFT)
        );

        panelToppings.add(jamon);
        panelToppings.add(pepperoni);
        panelToppings.add(chilePimiento);

        campos.add(new JLabel("Nombre:"));
        campos.add(nombre);

        campos.add(new JLabel("Salsa:"));
        campos.add(salsa);

        campos.add(new JLabel("Base:"));
        campos.add(base);

        campos.add(new JLabel("Toppings:"));
        campos.add(panelToppings);

        JButton crearOrden = new JButton("Crear Orden");

        JTextArea resumen = new JTextArea(10, 35);
        resumen.setEditable(false);

        resumen.setBorder(
            BorderFactory.createTitledBorder("Resumen de la Orden")
        );

        crearOrden.addActionListener(e -> {

            String nombreCliente = nombre.getText();
            String tipoSalsa = salsa.getSelectedItem().toString();
            String tipoBase = base.getSelectedItem().toString();

            int cantidad = 0;

            if (jamon.isSelected()) {
                cantidad++;
            }

            if (pepperoni.isSelected()) {
                cantidad++;
            }

            if (chilePimiento.isSelected()) {
                cantidad++;
            }

            Toppings[] toppings = new Toppings[cantidad];

            int posicion = 0;

            if (jamon.isSelected()) {
                toppings[posicion] = Toppings.JAMON;
                posicion++;
            }

            if (pepperoni.isSelected()) {
                toppings[posicion] = Toppings.PEPPERONI;
                posicion++;
            }

            if (chilePimiento.isSelected()) {
                toppings[posicion] = Toppings.CHILE_PIMIENTO;
            }

            Pizza pizza = new Pizza(tipoSalsa, tipoBase);

            pizza.anadirIngrediente(toppings);

            Orden orden = new Orden();

            Orden[] ordenes = {orden};

            Cocina cocina = new Cocina(ordenes);

            cocina.prepararBase(tipoBase);
            cocina.prepararSalsa(tipoSalsa);
            cocina.prepararIngredientes(toppings);

            pizza.mostrarEstado(true);

            String texto = "";

            texto += "===== RESUMEN DE LA ORDEN =====\n\n";
            texto += "Cliente: " + nombreCliente + "\n";
            texto += "Salsa: " + tipoSalsa + "\n";
            texto += "Base: " + tipoBase + "\n";
            texto += "\nToppings:\n";

            if (toppings.length == 0) {
                texto += "- Sin toppings\n";
            } else {
                for (Toppings topping : toppings) {
                    texto += "- " + topping + "\n";
                }
            }

            texto += "\nEstado: Pizza lista";

            resumen.setText(texto);
        });

        frame.add(campos, BorderLayout.NORTH);
        frame.add(crearOrden, BorderLayout.CENTER);
        frame.add(new JScrollPane(resumen), BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}