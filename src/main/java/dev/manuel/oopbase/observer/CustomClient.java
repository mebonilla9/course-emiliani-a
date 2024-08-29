package dev.manuel.oopbase.observer;

public class CustomClient implements Client {

  // Atributos
  private final String name;

  // Constructor
  public CustomClient(String name) {
    this.name = name;
  }

  // Metodos
  @Override
  public void update(String message) {
    System.out.println("Hola mi querido: "+name + " haz recibido el siguiente mensaje: " + message);
  }
}
