package entity;
import java.util.ArrayList;
import java.util.List;

public class TortitaRaspada extends Receta{
    public TortitaRaspada() {
        this.tiempoCoccion = 10;
        this.ingredientesReceta = new ArrayList<>(List.of(new Ingrediente("Harina", 3), new Ingrediente("Agua", 3), new Ingrediente("Levadura", 3)));
        this.preparacion = "Tamiza harina con sal, forma una corona. Agrega levadura disuelta en agua tibia y grasa en el centro. Mezcla con las manos hasta unir. Añade el resto del agua tibia y amasa hasta obtener una masa suave. Corta bollos de 40 gramos, deja reposar 20 minutos tapados. Da forma de tortita, pincha con tenedor y coloca en una placa para horno. Hornea a 200°C por 10 minutos o hasta que estén doradas.";
    }

    //@Override
    //public String toString(){
    //    return super.toString();
    //}
}
