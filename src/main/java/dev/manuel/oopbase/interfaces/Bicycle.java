package dev.manuel.oopbase.interfaces;

public class Bicycle implements BicycleActions {

  // Atributos (encapsulados)
  private String brand;
  private String color;
  private int numberOfGears;
  private boolean hasBasket;


  // Constructor con parámetros
  public Bicycle(String brand, String color, int numberOfGears, boolean hasBasket) {
    this.brand = brand;
    this.color = color;
    this.numberOfGears = numberOfGears;
    this.hasBasket = hasBasket;
  }

  // Métodos de acceso (getters)
  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public int getNumberOfGears() {
    return numberOfGears;
  }

  public boolean hasBasket() {
    return hasBasket;
  }

  // Métodos de modificación (setters) - Opcionales, dependiendo de tus necesidades
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setNumberOfGears(int numberOfGears) {
    this.numberOfGears = numberOfGears;

  }

  public void setHasBasket(boolean hasBasket) {
    this.hasBasket = hasBasket;
  }

  // Otros métodos (comportamientos) que podrías agregar
  public void ringBell() {
    System.out.println("¡Rin, rin!");
  }


  @Override
  public void pedal() {
    System.out.println("Pedaleando...");
  }

  @Override
  public void brake() {
    System.out.println("Frenando...");
  }
}
