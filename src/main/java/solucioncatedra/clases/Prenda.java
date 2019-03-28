package solucioncatedra.clases;

import solucioncatedra.interfaces.Estado;

public class Prenda{

    private double precioBase;
    private Estado estado;

    public Prenda(double precioBase, Estado estado){
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public double precioBase() {
        return precioBase;
    }

    public void cambiarPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Estado estado() {
        return estado;
    }

    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }

    public double precio(){
        return estado.precioFinal(this.precioBase);
    }


}
