import entity.Despensa;
import entity.Ingrediente;

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
    }
}
