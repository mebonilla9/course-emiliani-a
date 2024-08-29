package dev.manuel.oopbase.singleton;

public class MainSingleton {

  public static void main(String[] args) {

    // Obtener una instacia de configuration como singleton (!= new Configuration)
    Configuration config = Configuration.getInstance();

    config.setProperty("config.version", "3.0.1");

    config.setProperty("config.languaje", "Spanish");


    System.out.println(config.getProperty("config.version"));
    System.out.println(config.getProperty("config.languaje"));
    System.out.println(config.getProperty("config.abc"));

  }

}
