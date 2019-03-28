package interfaces;

import java.time.LocalDate;

public interface IVenta {
    double importe();
    boolean esDeFecha(LocalDate unaFecha);
    void agregarItem(IItem item);
}
