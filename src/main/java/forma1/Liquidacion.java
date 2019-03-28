package forma1;

import interfaces.IEstado;

public class Liquidacion implements IEstado {

    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal/2;
    }
}
