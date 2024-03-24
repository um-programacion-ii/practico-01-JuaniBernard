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

    public void getIngrediente(String nombre, int solicitado) {
        for (Ingrediente ingrediente: ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                ingrediente.sacar(solicitado);
                System.out.println("Update --> Ingrediente: " + ingrediente.nombre + " -- Cantidad " + ingrediente.cantidad);
            }
        }
    }

}
