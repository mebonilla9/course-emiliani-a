package dev.manuel.oopbase.exceptions;

public class MainExceptions {

  public static void main(String[] args) {

    try {
      double division = 10.0/3.0;
      System.out.println("El resultado de la division es: " + division);
    } catch (ArithmeticException e) {
      System.out.println("Estimado cliente, no puedes dividir un numero entero por 0 (cero)!");
    } finally {
      System.out.println("Pase lo que pase, yo siempre estare aqui!");
    }

  }

}
