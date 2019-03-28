package forma1;

import interfaces.IEstado;

public class Nueva implements IEstado {

    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal;
    }
}
