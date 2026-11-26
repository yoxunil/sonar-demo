package com.demo;

public class Main {

    public static void main(String[] args) {

        Producto laptop = new Producto("Laptop", 15000.0);
        Producto teclado = new Producto("Teclado", 500.0);

        Carrito carrito = new Carrito();

        double total1 = carrito.calcularTotal("DESC10", laptop.getPrecio(), 1);
        System.out.println("Total con DESC10: " + total1);

        double total2 = carrito.calcularTotal("DESC20", teclado.getPrecio(), 2);
        System.out.println("Total con DESC20: " + total2);

        double total3 = carrito.calcularTotal("OTRO", laptop.getPrecio(), 1);
        System.out.println("Total sin descuento: " + total3);
    }
}
