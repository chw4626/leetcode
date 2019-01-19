import java.awt.Point;

class Twitter {
    Map<Integer, Set<Integer>> userFollows;
    Map<Integer, List<Point>> userTweets;
    int timestamp;
    
    /** Initialize your data structure here. */
    public Twitter() {
        userFollows = new HashMap<>();
        userTweets = new HashMap<>();
        timestamp = 0;
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        userTweets.putIfAbsent(userId, new ArrayList<>());
        userTweets.get(userId).add(new Point(tweetId, timestamp++));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Point> pq = new PriorityQueue<Point>(10, (a, b) -> (b.y - a.y));
        Set<Integer> followeeIds = userFollows.getOrDefault(userId, new HashSet<>());
        followeeIds.add(userId);
        for (Integer followeeId: followeeIds) {
            pq.addAll(userTweets.getOrDefault(followeeId, new ArrayList<>()));
        }
        List<Integer> ret = new ArrayList<>();
        while (!pq.isEmpty() && ret.size() < 10) { ret.add(pq.poll().x); }
        return ret;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        userFollows.putIfAbsent(followerId, new HashSet<>());
        userFollows.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (userFollows.containsKey(followerId)) {
            userFollows.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */