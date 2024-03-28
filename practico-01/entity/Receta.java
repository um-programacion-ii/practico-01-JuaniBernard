package entity;
import java.util.ArrayList;
import java.util.List;

public class Receta {
    protected int tiempoCoccion;
    protected List<Ingrediente> ingredientesReceta;
    protected String preparacion;

    public Receta() {
        this.ingredientesReceta = new ArrayList<>();
    }

    public Receta(int tiempoCoccion, List<Ingrediente> ingredientesReceta, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientesReceta = ingredientesReceta;
        this.preparacion = preparacion;
    }

    @Override
    public String toString(){
        String result = "\nReceta:\n";
        for (Ingrediente ingrediente : ingredientesReceta) {
            result += ingrediente.toString() + "\n";
        }
        result += "Tiempo de cocción: " + tiempoCoccion + " minutos\n";
        result += "Preparación: " + preparacion + "\n";
        return result;
    }
}
