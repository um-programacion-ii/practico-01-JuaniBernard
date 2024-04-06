package service;

import entity.Despensa;
import entity.Ingrediente;
import entity.Receta;

public class CocinaService {
    public void prepararReceta(Receta receta, Despensa despensa) {
        boolean ingredientesDisponibles = true;
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            Ingrediente disponible = despensa.getIngrediente(ingrediente.getNombre(), ingrediente.getCantidad());
            if (disponible == null){
                ingredientesDisponibles = false;
                System.out.println("En la despensa no hay suficiente cantidad de " + ingrediente.getNombre());
            }
        }

        if (ingredientesDisponibles) {
            System.out.println("\nSe cocinará: " + receta.getClass().getSimpleName());
            System.out.println("Preparación: " + receta.getPreparacion());
        }
        else {
            System.out.println("No se puede preparar " + receta.getClass().getSimpleName() + " porque los ingredientes son insuficientes.");
        }
    }
}
