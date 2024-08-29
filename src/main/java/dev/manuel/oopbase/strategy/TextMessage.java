package dev.manuel.oopbase.strategy;

public class TextMessage implements Message{
  @Override
  public void sendMessage(String content, String destination) {
    System.out.println("Enviando mensaje de texto para: "+ destination + " contenido: " + content);
  }
}
