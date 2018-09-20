class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for(int i = 0; i < gas.length; i++){
            tank += gas[i]-cost[i];
        }
        if(tank < 0)
            return -1;
        
        int start = 0;
        int acc = 0;
        for(int i = 0; i < gas.length; i++){
            int curg = gas[i] - cost[i];
            if (acc+curg < 0){
                start = i+1;
                acc = 0;
            }
            else acc += curg;
        }
        return start;
    }
}