package solucioncatedra.clases.estados;

import solucioncatedra.interfaces.Estado;

public class Promocion implements Estado {
    //SUPONGO QUE DESCUENTO ES UN PORCENTAJE DEL PRECIOBASE
    private double descuento;

    public Promocion(double descuento){
        this.descuento = descuento;
    }

    @Override
    public double precioFinal(double precioBasse) {
        return precioBasse*(1-descuento/100);
    }
}
