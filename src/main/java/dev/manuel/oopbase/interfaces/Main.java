package dev.manuel.oopbase.interfaces;

public class Main {

  public static void main(String[] args) {

    // Crear una bicicleta usando el constructor con parámetros
    Bicycle yourBike = new Bicycle("Trek", "Azul", 21, true);
    System.out.println("Tu bicicleta es de la marca " + yourBike.getBrand() + " y es de color " + yourBike.getColor());


    if (yourBike.hasBasket()) {
      System.out.println("Tu bicicleta tiene canasta.");
    }

    // Hacer sonar la campana de tu bicicleta
    yourBike.ringBell();
  }

}
