class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; ++i)
            q.add(i);

        int[] ans = new int[n];
        Arrays.sort(deck);
        for (int card: deck) {
            ans[q.poll()] = card;
            q.add(q.poll());
        }

        return ans;
    }
}