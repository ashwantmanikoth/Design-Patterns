package L10.strategy;

public class ChatClient {

  private Encryption encryptionStrategy;

  public ChatClient(Encryption encryptionStrategy) {
    this.encryptionStrategy = encryptionStrategy;
  }

  public void send(String message) {
    encryptionStrategy.encrypt(message);
    System.out.println("Sending the encrypted message...");
  }
}
