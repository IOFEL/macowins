package solucioncatedra.clases.estados;

import solucioncatedra.interfaces.Estado;

public class Liquidacion implements Estado {

    @Override
    public double precioFinal(double precioBase) {
        return precioBase/2;
    }
}
