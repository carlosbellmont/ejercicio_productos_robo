package com.ejemplo;

public class PlayStation implements ProductoALaVenta{

    int precio = 399;
    int posibilidadesDeSerRobado = 10;

    @Override
    public String getNombre() {
        return "PlayStation";
    }

    @Override
    public int calcularPosibibilidadDeSerRobado() {
        return precio * posibilidadesDeSerRobado;
    }

    @Override
    public int compararPosibilidadesDeSerRobados(ProductoALaVenta productoALaVenta) {
        return Integer.compare(calcularPosibibilidadDeSerRobado(), productoALaVenta.calcularPosibibilidadDeSerRobado());
        /*
        if (calcularPosibibilidadDeSerRobado() < productoALaVenta.calcularPosibibilidadDeSerRobado()){
            return -1;
        } else if (calcularPosibibilidadDeSerRobado() > productoALaVenta.calcularPosibibilidadDeSerRobado()) {
            return 1;
        } else { // caso 0
            return 0;
        }
        */
    }
}
