package solucioncatedra.clases.estados;


import solucioncatedra.interfaces.Estado;

public class Nueva implements Estado {

    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal;
    }
}
