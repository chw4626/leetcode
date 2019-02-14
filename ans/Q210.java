class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int[] degree = new int[numCourses];
        ArrayList[] graph = new ArrayList[numCourses];
        Queue q = new LinkedList();
        int count = 0;
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < prerequisites.length; i++){
            degree[prerequisites[i][0]]++;
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        int index = 0;
        for(int i = 0; i < degree.length; i++){
            if(degree[i] == 0){
                q.add(i);
                count++;
                res[index] = i;
                index++;
            }
        }
        while(!q.isEmpty()){
            int course = (int)q.poll();
            for(int i = 0; i < graph[course].size(); i++){
                int pre = (int)graph[course].get(i);
                degree[pre]--;
                if(degree[pre] == 0){
                    q.add(pre);
                    count++;
                    res[index] = pre;
                    index++;
                }
            }
        }
        return count == numCourses ? res : new int[] {};
    }
}