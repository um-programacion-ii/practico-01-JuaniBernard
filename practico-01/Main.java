import entity.*;
import service.CocinaService;

public class Main {
    public static void main(String[] args) {
        // Creamos dos nuevos ingredientes
        Ingrediente harina = new Ingrediente("Harina", 10);
        Ingrediente agua = new Ingrediente("Agua", 10);
        Ingrediente levadura = new Ingrediente("Levadura", 5);
        System.out.println(harina);
        System.out.println(agua);
        System.out.println(levadura);

        // Agregamos ingredientes a la lista
        Despensa despensa = new Despensa();
        despensa.addIngrediente(harina);
        despensa.addIngrediente(agua);
        despensa.addIngrediente(levadura);

        // Quitamos cierta cantidad de ingredientes
        despensa.getIngrediente("Harina", 5);
        despensa.getIngrediente("Agua", 8);
        despensa.getIngrediente("Levadura", 6);

        // Instanciamos recetas
        PrePizza prePizza = new PrePizza();
        System.out.println(prePizza);
        PanCasero panCasero = new PanCasero();
        System.out.println(panCasero);
        TortitaRaspada tortitaRaspada = new TortitaRaspada();
        System.out.println(tortitaRaspada);

        // Instanciamos chef y preparamos recetas
        Chef chef = new Chef("Remy", 3);
        System.out.println(chef);
        chef.cocinar(prePizza, despensa);
        chef.cocinar(tortitaRaspada, despensa);
    }
}
