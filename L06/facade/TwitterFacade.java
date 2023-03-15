package L06.facade;

import java.util.List;

public class TwitterFacade {
    String accessToken;
    static TwitterClient twitterClient;

    public TwitterFacade(String secret, String appKey) {
        OAuth oAuth = new OAuth();
        accessToken = oAuth.getAccessToken(oAuth.requestToken(appKey, secret));
        if (twitterClient == null) {
            twitterClient = new TwitterClient();
        }
    }

    public List<Tweet> getRecentTweets() {
        return twitterClient.getRecentTweets(accessToken);
    }

    public Boolean likeATweet(String tweetId) {
        return twitterClient.likeTweet(accessToken,tweetId);
    }

    public void composeTweet(String message) {
        twitterClient.composeTweet(accessToken,message);
    }
}
