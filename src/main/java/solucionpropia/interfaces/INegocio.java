package solucionpropia.interfaces;

import java.time.LocalDate;

public interface INegocio {
    double gananciasDe(LocalDate unDia);
    void vender(IVenta venta);
    double gananciasDeUnPeriodo(LocalDate fechaInicio, LocalDate fechaFin);
}
