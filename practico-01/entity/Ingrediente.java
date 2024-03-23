package entity;

public class Ingrediente {
    protected String nombre;
    protected int cantidad;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return("Ingrediente: " + nombre + " -- Cantidad: " + cantidad);
    }

    public void sacar(int solicitado){
        if (cantidad > 0)
            cantidad = cantidad - solicitado;
        else
            System.out.println("No queda más " + nombre);
    }
}
