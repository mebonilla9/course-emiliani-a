package dev.manuel.oopbase.singleton;

import java.util.Properties;

public class Configuration {

  // La unica instancia de esta clase sea estatica

  private static Configuration instance;

  private Properties properties;

  private Configuration(){
    this.properties = new Properties();
  }

  // Definir el metodo de acceso de el objeto singleton
  public static Configuration getInstance(){
    if (instance == null){
      instance = new Configuration();
    }
    return instance;
  }

  public void setProperty(String key, String value){
    this.properties.setProperty(key, value);
  }

  public String getProperty(String key){
    return this.properties.getProperty(key);
  }

}
