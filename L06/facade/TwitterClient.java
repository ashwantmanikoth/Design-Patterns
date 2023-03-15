package L06.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return new ArrayList<>();
  }

  public Boolean likeTweet(String accessToken, String tweetID) {
    System.out.print("Tweet with "+tweetID);
    return true;
  }

  public void composeTweet(String accessToken, String message) {
    System.out.println(message+"tweeted");
  }
}
