package com.practicavectores.mvc.controllers;

import java.util.Scanner;

public class Ejercicio2 {

  public void run() {

    Scanner scanner = new Scanner(System.in);

    do {

      System.out.println("Favor ingrese una cantidad monetaria");
      int dinero = scanner.nextInt();
      System.out.println(dinero);

    } while (!scanner.hasNextInt());

  }

}