package dev.manuel.oopbase.strategy;

public class MainStrategy {

  public static void main(String[] args) {
    new MainStrategy().init();
  }

  private void init() {
    MessageManager manager = new MessageManager();

    // Enviar un mensaje de texto
    manager.setStrategy(new TextMessage());
    manager.sendMessage("Hola, ¿cómo estás?", "123456789");

    // Enviar un correo electrónico
    manager.setStrategy(new MailMessage());
    manager.sendMessage("Importante: Reunión mañana", "usuario@example.com");

    // Enviar una notificación push
    manager.setStrategy(new NotificationMessage());
    manager.sendMessage("Nueva oferta disponible", "dispositivo123");
  }
}
