package L06.facade;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
  public List<Tweet> getRecentTweets(String accessToken) {
    System.out.println("Getting recent tweets");

    return new ArrayList<>();
  }

  public List getAllPosts(String accessToken) {
    System.out.println("All twitter posts");
    return new ArrayList<>();
  }
}
