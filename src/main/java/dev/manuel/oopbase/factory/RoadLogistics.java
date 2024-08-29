package dev.manuel.oopbase.factory;

public class RoadLogistics extends Logistics{

  @Override
  public Transport createTransport() {
    return new Truck();
  }

}
