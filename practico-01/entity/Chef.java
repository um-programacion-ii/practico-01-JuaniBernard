package entity;

import service.CocinaService;

public class Chef {
    protected String nombre;
    protected int estrellasMichelin;

    public Chef() {
    }

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    public void cocinar(Receta receta, Despensa despensa) {
        CocinaService cocinaService = new CocinaService();
        cocinaService.prepararReceta(receta, despensa);
    }

    @Override
    public String toString(){
        return("Chef: " + nombre + " -- Estrellas Michelin: " + estrellasMichelin);
    }
}
