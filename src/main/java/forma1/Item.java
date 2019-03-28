package forma1;

import interfaces.IItem;

public class Item implements IItem {
    private int cantidad;
    private Prenda prenda;

    public Item(Prenda prenda, int cantidad){
        this.cantidad = cantidad;
        this.prenda = prenda;
    }

    public double importe(){
        return cantidad*prenda.precio();
    }

}
