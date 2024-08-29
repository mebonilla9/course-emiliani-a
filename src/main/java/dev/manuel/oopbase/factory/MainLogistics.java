package dev.manuel.oopbase.factory;

import java.io.BufferedReader;
import java.io.IOException;

public class MainLogistics {

  private final BufferedReader teclado;


  public MainLogistics() {
    this.teclado = new BufferedReader(new java.io.InputStreamReader(System.in));
  }

  public static void main(String[] args) {

    MainLogistics main = new MainLogistics();
    try {
      main.init();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private void init() throws IOException {
    System.out.println("""
      Bienvenido al sistema de operacion logistica simple
      Elija una opcion para continuar
      """);
    int option = -1;
    while (option != 0) {
      option = menu();
      setTransport(option);
    }
  }

  private void setTransport(int option) throws IOException {
    switch (option) {
      case 1 -> {
        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
      }
      case 2 -> {
        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
      }
      case 0 -> {
        System.out.println("Saliendo...");
      }
      default -> {
        System.out.println("Opcion invalida");
        this.init();
      }
    }
  }
  private int menu() throws IOException {
    String menu = """
      Elija una opcion
      1. Transporte por tierra
      2. Transporte por mar
      0. Salir
      """;
    System.out.println(menu);
    return Integer.parseInt(teclado.readLine());
  }

}
