class MyHashSet {

    int bucket = 1000;
    int remain = 1001;
    boolean[][] table; 
    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new boolean[bucket][];
    }
    
    public int hash(int key){
        return key / bucket;
    }
    
    public int pos(int key){
        return key % bucket;
    }
    
    public void add(int key) {
        
        if(table[hash(key)] == null)
            table[hash(key)] = new boolean[remain];
        table[hash(key)][pos(key)] = true;
    }
    
    public void remove(int key) {
        if(table[hash(key)] != null)
            table[hash(key)][pos(key)] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(table[hash(key)] != null && table[hash(key)][pos(key)])
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */