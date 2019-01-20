class MyCalendar {

    TreeMap<Integer,Integer> tmap;
    public MyCalendar() {
        tmap = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer floorkey = tmap.floorKey(end - 1);
        if(floorkey!=null && tmap.get(floorkey) > start)
            return false;
        tmap.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */