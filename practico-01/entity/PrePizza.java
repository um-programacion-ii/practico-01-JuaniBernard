package entity;
import java.util.ArrayList;
import java.util.List;

public class PrePizza extends Receta{
    public PrePizza() {
        this.tiempoCoccion = 8;
        this.ingredientesReceta = new ArrayList<>(List.of(new Ingrediente("Harina", 1), new Ingrediente("Agua", 1), new Ingrediente("Levadura", 1)));
        this.preparacion = "Mezcla levadura, agua tibia, deja reposar, luego combina con harina, y agua, forma una masa, deja reposar, divide en dos, estira en círculos, deja reposar, hornea por 8 minutos.";
    }

    //@Override
    //public String toString(){
    //    return super.toString();
    //}
}
