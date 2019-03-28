package forma1;

import interfaces.IItem;
import interfaces.IVenta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta implements IVenta {
    private List<IItem> items;
    private LocalDate fecha;

    public Venta(LocalDate fecha){
        this.items = new ArrayList<>();
        this.fecha = fecha;
    }

    public  boolean esDeFecha(LocalDate unaFecha){
        return fecha.equals(unaFecha);
    }

    public double importe(){
        return items.stream().mapToDouble(IItem::importe).sum();
    }

    public void agregarItem(IItem item){
        items.add(item);
    }
}
