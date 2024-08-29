package dev.manuel.oopbase.statics;

public class Car {

  // Atributos de clase
  private String name;
  private String engine;

  // Variable estatica de clase
  public static int numberOfCars = 0;

  /**
   * metodo Constructor
   *
   * Object obj = new
   */
  public Car(String name, String engine){
    this.name = name;
    this.engine = engine;
    numberOfCars++;
  }

  // Getter -> leer
  public String getName() {
    return name;
  }

  public String getEngine() {
    return engine;
  }

  // Setter -> escribir o sobreescribir
  public void setName(String name) {
    this.name = name;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }
}
