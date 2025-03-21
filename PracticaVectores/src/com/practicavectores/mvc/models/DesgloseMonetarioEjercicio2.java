package com.practicavectores.mvc.models;

import java.util.Arrays;
import java.util.Vector;

public class DesgloseMonetarioEjercicio2 {
  private static Vector<Integer> billetes_monedas;

  static {
    Integer denominaciones[] = { 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5 };
    billetes_monedas = new Vector<Integer>(Arrays.asList(denominaciones));
  }

  public static String desglosarDenominaciones(int monto_dinero) {

    String resultado = "";
    int i = 0;

    for (int denominacion : billetes_monedas) {

      if (monto_dinero >= denominacion) {
        int calculo = monto_dinero / denominacion;
        resultado += "* " + calculo + " de " + denominacion + "\n";
        monto_dinero -= calculo * denominacion;
      }

      i++;

    }

    return resultado;
  }

}