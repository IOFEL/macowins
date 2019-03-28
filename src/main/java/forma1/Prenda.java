package forma1;

import interfaces.IEstado;
import interfaces.IPrenda;

public class Prenda implements IPrenda {

    private double precioBase;
    private IEstado estado;

    public double precioBase() {
        return precioBase;
    }

    public void cambiarPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public IEstado estado() {
        return estado;
    }

    public void cambiarEstado(IEstado estado){
        this.estado = estado;
    }

    public double precio(){
        return estado.precioFinal(this.precioBase);
    }


}
