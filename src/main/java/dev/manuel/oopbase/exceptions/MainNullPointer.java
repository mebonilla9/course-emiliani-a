package dev.manuel.oopbase.exceptions;

public class MainNullPointer {

  public static void main(String[] args) {
    try {
      String text = "null";

      System.out.println(text.length());
    } catch (NullPointerException e) {
      System.out.println("El texto es nulo y no puedo acceder a su longitud");
    }
  }
}
