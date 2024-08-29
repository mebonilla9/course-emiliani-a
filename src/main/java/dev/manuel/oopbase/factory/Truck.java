package dev.manuel.oopbase.factory;

public class Truck implements Transport{
  @Override
  public void deliver() {
    System.out.println("Deliver send by Truck");
  }
}
