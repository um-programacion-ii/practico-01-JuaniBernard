package entity;
import java.util.ArrayList;
import java.util.List;

public class PanCasero extends Receta{
    public PanCasero() {
        this.tiempoCoccion = 45;
        this.ingredientesReceta = new ArrayList<>(List.of(new Ingrediente("Harina", 2), new Ingrediente("Agua", 2), new Ingrediente("Levadura", 2)));
        this.preparacion = "Mezcla agua templada, levadura fresca y azúcar, deja reposar. Agrega la mitad de la harina y todo el aceite, reposa 20 minutos. Añade el resto de la harina y la sal, amasa sobre una superficie enharinada. Forma una bola y colócala en una bandeja de horno, haz cortes en la superficie, espolvorea con harina. Cubre con un recipiente apto para horno previamente engrasado y hornea a 200 ºC durante 45 minutos. Enfría sobre una rejilla antes de consumir.";
    }

    //@Override
    //public String toString(){
    //    return super.toString();
    //}
}
