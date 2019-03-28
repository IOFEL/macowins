package forma1;

import interfaces.INegocio;
import interfaces.IVenta;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Negocio implements INegocio {

     private List<IVenta> ventas;

    @Override
    public double gananciasDe(LocalDate unDia) {
        if(ventas.stream().anyMatch(venta->venta.esDeFecha(unDia)))
                return ventas.stream().filter(venta->venta.esDeFecha(unDia)).mapToDouble(IVenta::importe).sum();
        return 0;
    }

    @Override
    public void vender(IVenta venta) {
        ventas.add(venta);
    }

    @Override
    public double gananciasDeUnPeriodo(LocalDate fechaInicio, LocalDate fechaFin) {
        Period periodo = Period.between(fechaInicio,fechaFin);

        return 0;
    }
}
