package dev.manuel.oopbase.factory;

public abstract class Logistics {

  public void planDelivery(){
    Transport transport = createTransport();
    transport.deliver();
  }

  public abstract Transport createTransport();

}
