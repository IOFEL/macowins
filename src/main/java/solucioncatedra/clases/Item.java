package solucioncatedra.clases;

public class Item {
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
