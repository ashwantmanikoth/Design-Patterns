package L06.facade;

import java.util.List;

public class Demo {
  public static void show() {
    TwitterFacade twitterFacade = new TwitterFacade("appKey", "secret");
    List tweets =  twitterFacade.getRecentTweets();
    List posts = twitterFacade.getAllPosts();
  }
}
