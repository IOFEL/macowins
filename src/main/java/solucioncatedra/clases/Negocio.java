package solucioncatedra.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Negocio {

    private List<Venta> ventas;

    public Negocio(){
        ventas = new ArrayList<>();
    }

    public double gananciasDe(LocalDate unDia) {
        if(ventas.stream().anyMatch(venta->venta.esDeFecha(unDia)))
                return ventas.stream().filter(venta->venta.esDeFecha(unDia)).mapToDouble(Venta::importe).sum();
        return 0;
    }

    public void vender(Venta venta) {
        ventas.add(venta);
    }
}
