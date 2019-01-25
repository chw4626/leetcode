class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for(int i = 1; i < candies.length; i++){
            if(candies[i] != candies[i-1])
                count++;
        }
        return count > candies.length / 2 ? candies.length/2 : count;
    }
}