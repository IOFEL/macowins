package solucioncatedra.clases;

import java.time.LocalDate;

public class VentaConTarjeta extends Venta{

    private double coeficienteTarjeta;
    private int cantCuotas;

    public VentaConTarjeta(LocalDate fecha){
        super(fecha);
    }

    public double importe(){
        return super.importe()*coeficienteTarjeta*cantCuotas;
    }
}
