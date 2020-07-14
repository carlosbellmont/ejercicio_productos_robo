package com.ejemplo;

public class Pc implements ProductoALaVenta {

    int precio = 1099;
    int posibilidadesDeSerRobado = 1;
    public String nombre;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int calcularPosibibilidadDeSerRobado() {
        return precio * posibilidadesDeSerRobado;
    }

    @Override
    public int compararPosibilidadesDeSerRobados(ProductoALaVenta productoALaVenta) {
        return Integer.compare(calcularPosibibilidadDeSerRobado(), productoALaVenta.calcularPosibibilidadDeSerRobado());
    }
}
