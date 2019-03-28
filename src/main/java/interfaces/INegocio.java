package interfaces;

import java.time.LocalDate;
import java.time.Period;

public interface INegocio {
    double gananciasDe(LocalDate unDia);
    void vender(IVenta venta);
    double gananciasDeUnPeriodo(LocalDate fechaInicio, LocalDate fechaFin);
}
