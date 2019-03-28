package solucioncatedra.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Item> items;
    private LocalDate fecha;

    public Venta(LocalDate fecha){
        this.items = new ArrayList<>();
        this.fecha = fecha;
    }

    public  boolean esDeFecha(LocalDate unaFecha){
        return fecha.equals(unaFecha);
    }

    public double importe(){
        return items.stream().mapToDouble(Item::importe).sum();
    }

    public void agregarItem(Item item){
        items.add(item);
    }
}
