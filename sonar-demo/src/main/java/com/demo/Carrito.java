package com.demo;

public class Carrito {

    public double calcularTotal(String cupon, double precio, int cantidad) {

        double total = precio * cantidad;
        double resultado = 0;
        int contadorSinUsar = 0;
        String textoSinUsar = "nada";

        if (cupon == "DESC10") {
            resultado = total - (total * 0.10);
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
        } else if (cupon == "DESC20") {
            resultado = total - (total * 0.20);
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
        } else if (cupon == "DESC30") {
            resultado = total - (total * 0.30);
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
            System.out.println("aplicando cupon");
        }

        return resultado;
    }
}
