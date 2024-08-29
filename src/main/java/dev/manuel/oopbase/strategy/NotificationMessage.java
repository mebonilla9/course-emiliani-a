package dev.manuel.oopbase.strategy;

public class NotificationMessage implements Message{
  @Override
  public void sendMessage(String content, String destination) {
    System.out.println("Enviando notificacion push para: "+ destination + " contenido: " + content);
  }
}
