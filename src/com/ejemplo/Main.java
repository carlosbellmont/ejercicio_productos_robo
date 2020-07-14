package com.ejemplo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PlayStation ps1 = new PlayStation();
        Xbox xbox1 = new Xbox();
        Pc pc1 = new Pc();
        pc1.nombre = "pc1";
        Pc pc2 = new Pc();
        pc2.nombre = "pc2";



        ArrayList<ProductoALaVenta> listaProductos = new ArrayList<>();
        listaProductos.add(ps1);
        listaProductos.add(xbox1);
        listaProductos.add(pc1);
        listaProductos.add(pc2);

        for (ProductoALaVenta productoALaVenta1 : listaProductos) {
            for (ProductoALaVenta productoALaVenta2 : listaProductos) {
                if (productoALaVenta1 == productoALaVenta2) {
                    System.out.println("Son el mismo producto");
                } else {
                    System.out.println("Comparamos a " + productoALaVenta1.getNombre() + " con " + productoALaVenta2.getNombre());
                    compare(productoALaVenta1, productoALaVenta2);
                }
            }
        }

    }

    private static void compare(ProductoALaVenta producto1, ProductoALaVenta producto2){
        int restultado = producto1.compararPosibilidadesDeSerRobados(producto2);
        if (restultado == -1){
            System.out.println("Debemos proteger al segundo producto");
        } else if (restultado == 1) {
            System.out.println("Debemos proteger al primer producto");
        } else { // caso 0
            System.out.println("Debemos proteger ambos productos");
        }
    }
}
