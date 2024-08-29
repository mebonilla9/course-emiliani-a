package dev.manuel.oopbase.observer;

import java.util.ArrayList;
import java.util.List;

public class Product {

  private final List<Client> clients;
  private final String name;
  private Boolean available;

  public Product(String name) {
    this.clients = new ArrayList<>();
    this.name = name;
    this.available = false;
  }

  public void addClient(Client client) {
    clients.add(client);
  }

  public void removeClient(Client client) {
    clients.remove(client);
  }

  public void setAvailable(Boolean available) {
    this.available = available;
    if (available) {
      notifyClients();
    }
  }

  private void notifyClients() {
    for (Client client : clients) {
      client.update("El producto: " + name + " se encuentra disponible");
    }
  }

}
