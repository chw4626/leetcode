class Twitter {
    Map<Integer, List<tweet>> twt = new HashMap<>();
    Map<Integer, Set<Integer>> relation = new HashMap<>();
    static int count = 0;;
    /** Initialize your data structure here. */
    public Twitter() {
        
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!relation.containsKey(userId)){
            relation.put(userId,new HashSet<>());
            relation.get(userId).add(userId);
        }
        if(!twt.containsKey(userId))
            twt.put(userId,new ArrayList<tweet>());
        twt.get(userId).add(new tweet(count++,tweetId));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        if (!relation.containsKey(userId)) return new ArrayList<>();
        Set<Integer> temp = relation.get(userId);
        PriorityQueue<tweet> feed = new PriorityQueue<>((t1, t2) -> t2.time - t1.time);
        for(int id : temp){
            if(twt.get(id) == null)
                continue;
            List<tweet> tt = twt.get(id);
            for(int i = 0; i < tt.size(); i++){
                feed.add(tt.get(i));
            }
        }
        List<Integer> res = new ArrayList<>();
        while (feed.size() > 0 && res.size() < 10) res.add(feed.poll().id);
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if (!relation.containsKey(followerId)){
            relation.put(followerId, new HashSet<>());
            relation.get(followerId).add(followerId);
            
        }
        relation.get(followerId).add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(relation.containsKey(followerId) && followerId!= followeeId)
            relation.get(followerId).remove(followeeId);
    }
    
    class tweet{
        int time;
        int id;
        
        public tweet(int time, int id){
            this.time = time;
            this.id = id;
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