package entity;
import java.util.ArrayList;
import java.util.List;

public class Despensa {
    protected List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public Despensa(List<Ingrediente> listIngredientes) {
        this.ingredientes = listIngredientes;
    }

    public void addIngrediente(Ingrediente newIngrediente) {
        ingredientes.add(newIngrediente);
    }

    public Ingrediente getIngrediente(String nombre, int solicitado) {
        for (Ingrediente ingrediente: ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                boolean disponible = ingrediente.sacar(solicitado);
                if (disponible) {
                    System.out.println("Update --> Ingrediente: " + ingrediente.nombre + " -- Cantidad " + ingrediente.cantidad);
                    return ingrediente;
                }
                else {
                    return null;
                }
            }
        }
        return null;
    }

}
