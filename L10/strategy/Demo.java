package L10.strategy;

public class Demo {

  public static void main(String[] args){

    ChatClient chatClient = new ChatClient(new AESAlgo());
    chatClient.send("Hello in AES");

    ChatClient chatClient1 = new ChatClient(new DESAlgo());
    chatClient.send("Hello in DES");
  }
}
