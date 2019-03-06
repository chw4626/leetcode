class Solution {
    Map<String, PriorityQueue<String>> flights;
    LinkedList<String> path;
    public List<String> findItinerary(String[][] tickets) {
        flights = new HashMap<>();
        path = new LinkedList<>();
        for(String[] t : tickets){
            flights.putIfAbsent(t[0], new PriorityQueue<>());
            flights.get(t[0]).add(t[1]);
            //flights.getOrDefault(t[0],new PriorityQueue<>()).add(t[1]);
            //System.out.println(flights.get(t[0]));
        }
        dfs("JFK");
        return path;
    }
    public void dfs(String de){
        PriorityQueue<String> ar = flights.get(de);
        while(ar!=null && !ar.isEmpty())
            dfs(ar.poll());
        path.addFirst(de);
    }
}