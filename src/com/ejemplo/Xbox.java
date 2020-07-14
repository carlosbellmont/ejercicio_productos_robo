package com.ejemplo;

public class Xbox implements ProductoALaVenta {

    int precio = 499;
    int posibilidadesDeSerRobado = 3;

    @Override
    public String getNombre() {
        return "Xbox";
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
