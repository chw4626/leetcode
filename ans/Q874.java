class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set= new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + " " + o[1]);
        }
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int d = 0, x = 0, y = 0, res = 0;        
        for(int i = 0; i < commands.length; i++){
            if(commands[i] == -1){
                d++;
                d %= 4;
            }
            else if(commands[i] == -2){
                d--;
                if(d < 0)
                    d += 4;
            }
            else{
                int step = 0;
                while(step < commands[i] && !set.contains( (x + dir[d][0]) + " "+ (y+dir[d][1]) ) ){
                    x += dir[d][0];
                    y += dir[d][1];
                    step++;
                }
            }
            res = Math.max(res, x * x + y * y);
        }
        return res;
    }
}