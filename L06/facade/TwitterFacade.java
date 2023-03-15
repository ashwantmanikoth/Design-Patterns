package L06.facade;

import java.awt.*;
import java.util.ArrayList;
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

    public List getAllPosts() {
        return twitterClient.getAllPosts(accessToken);
    }
}
