package dev.manuel.oopbase.strategy;

public class MessageManager {

  private Message strategy;

  public void setStrategy(Message strategy){
    this.strategy = strategy;
  }

  public void sendMessage(String content, String destination){
    strategy.sendMessage(content,destination);
  }

}
