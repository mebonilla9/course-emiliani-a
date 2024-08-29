package dev.manuel.oopbase.factory;

public class Ship implements Transport{
  @Override
  public void deliver() {
    System.out.println("Deliver send by ship");
  }
}
