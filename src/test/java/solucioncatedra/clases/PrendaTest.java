package solucioncatedra.clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solucioncatedra.clases.estados.Liquidacion;
import solucioncatedra.clases.estados.Nueva;
import solucioncatedra.clases.estados.Promocion;
import solucioncatedra.interfaces.Estado;

import static org.junit.jupiter.api.Assertions.*;

class PrendaTest {

    private Estado liquidacion;
    private Estado promocion;
    private Estado nueva;
    private Prenda prenda;

    @BeforeEach
    void setUp() {
        liquidacion = new Liquidacion();
        promocion = new Promocion(25);
        nueva = new Nueva();
        prenda = new Prenda(1000, null);
    }

    @Test
    void precioBase() {
        assertEquals(prenda.precioBase(),1000,0.1);
        prenda.cambiarEstado(nueva);
        assertEquals(prenda.precioBase(),1000,0.1);
        prenda.cambiarEstado(liquidacion);
    }

    @Test
    void cambiarPrecioBase() {
        assertEquals(prenda.precioBase(),1000,0.1);
        prenda.cambiarPrecioBase(2000);
        assertEquals(prenda.precioBase(),2000,0.1);
        assertNotEquals(prenda.precioBase(),2001);
    }

    @Test
    void estado() {
        assertNull(prenda.estado());
        prenda.cambiarEstado(liquidacion);
        assertEquals(prenda.estado(),liquidacion);
        assertSame(prenda.estado(),liquidacion);
        prenda.cambiarEstado(promocion);
        assertEquals(prenda.estado(),promocion);
        assertSame(prenda.estado(),promocion);
        prenda.cambiarEstado(nueva);
        assertEquals(prenda.estado(),nueva);
        assertSame(prenda.estado(),nueva);
    }

    @Test
    void cambiarEstado() {
        assertNull(prenda.estado());
        prenda.cambiarEstado(liquidacion);
        assertEquals(prenda.estado(),liquidacion);
    }

    @Test
    void precio() {
        prenda.cambiarEstado(nueva);
        assertEquals(prenda.precio(),prenda.precioBase(),0.1);
        prenda.cambiarEstado(liquidacion);
        assertEquals(prenda.precio(),500,0.1);
        prenda.cambiarEstado(promocion);
        assertEquals(prenda.precio(),750,0.1);
    }
}