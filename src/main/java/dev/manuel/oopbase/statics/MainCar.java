package dev.manuel.oopbase.statics;

public class MainCar {

  public static void main(String[] args) {
    Car miPrimerCarrito = new Car("Renault","v2");

    //Car miPrimerCarrito = new Car();

    System.out.println("El nombre de mi primer carrito es: " + miPrimerCarrito.getName());

    System.out.println("Numero de carros existentes: " + Car.numberOfCars);

    Car carroTrabajo = new Car("Tesla", "Full Electrico");

    /*Car carroTrabajo = new Car();
    carroTrabajo.setName("Tesla");
    carroTrabajo.setEngine("Full Electrico");*/

    System.out.println("El nombre de mi segundo carrito es: " + carroTrabajo.getName());

    System.out.println("Numero de carros existentes: " + Car.numberOfCars);
  }
}
