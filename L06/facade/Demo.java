package L06.facade;

import java.util.List;

public class Demo {
  public static void show() {
    TwitterFacade twitterFacade = new TwitterFacade("appKey", "secret");
    List tweets =  twitterFacade.getRecentTweets();
    //liking tweet
    Boolean likeStatus = twitterFacade.likeATweet((String) tweets.get(1));
    if(likeStatus){
      System.out.println("Tweet Liked!");
    }
    //composing
    twitterFacade.composeTweet("Message");
  }
}
