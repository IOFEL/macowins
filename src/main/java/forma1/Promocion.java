package forma1;

import interfaces.IEstado;

public class Promocion implements IEstado {

    private double descuento;

    public Promocion(double descuento){
        this.descuento = descuento;
    }

    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal*(1+descuento/100);
    }
}
