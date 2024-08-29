package dev.manuel.oopbase.collections;

import java.util.ArrayList;

public class MainCollections {

  public static void main(String[] args) {

    int[] intArray = new int[10]; // length --> Posicion fisica

    ArrayList<String> miPrimeraColleccion = new ArrayList<>();

    // <>

    // Agregar datos a la coleccion
    miPrimeraColleccion.add("Hola niños!");
    miPrimeraColleccion.add("2024");
    miPrimeraColleccion.add("true");

    for (int i = 0; i < miPrimeraColleccion.size(); i++) {
      // Recuperar un valor dentro de la coleccion
      System.out.println(miPrimeraColleccion.get(i));
    }

  }
}
