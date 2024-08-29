package dev.manuel.oopbase.strategy;

public class MailMessage implements Message {
  @Override
  public void sendMessage(String content, String destination) {
    System.out.println("Enviando mensaje de correo electronico para: "+ destination + " contenido: " + content);
  }
}
