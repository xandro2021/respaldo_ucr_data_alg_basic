package com.practicavectores.mvc.controllers;

import java.util.Scanner;

import com.practicavectores.mvc.models.DesgloseMonetarioEjercicio2;

public class Ejercicio2 {

  public void run() {

    Scanner scanner = new Scanner(System.in);

    int dinero;

    System.out.println("Favor ingrese una cantidad monetaria:");

    while (!scanner.hasNextInt()) {
      System.out.println("Entrada inválida. Por favor ingrese un monto entero de dinero:");
      scanner.next(); // Limpiar entrada incorrecta
    }

    dinero = scanner.nextInt();

    String resultado = DesgloseMonetarioEjercicio2.desglosarDenominaciones(dinero);

    System.out.println("La cantidad ingresada fue de $" + dinero);
    System.out.println(resultado);
    System.out.println("Fin");

  }

}