package dev.manuel.oopbase.observer;

public class MainObserver {

  public static void main(String[] args) {
    new MainObserver().init();
  }

  public void init() {
    Client clientOne = new CustomClient("Manuel");
    Client clientTwo = new CustomClient("Sergio");
    Client clientThree = new CustomClient("Estefany");
    Client clientFour = new CustomClient("Edwin");
    Client clientFive = new CustomClient("Marcos");

    Product product = new Product("Google Pixel pro 9");

    product.addClient(clientOne);
    product.addClient(clientTwo);
    product.addClient(clientThree);
    product.addClient(clientFour);
    product.addClient(clientFive);

    product.setAvailable(true);
  }
}
