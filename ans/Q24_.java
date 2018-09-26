    public ListNode swapPairs(ListNode head) {
        
        
        if((head == null)|| (head.next == null)) return head;
        
            ListNode dumn = new ListNode(0);
            dumn.next = head;
            ListNode l1 = dumn;
            ListNode l2 = head;
        
            while(l2!= null&& l2.next!= null){
                ListNode nexts = l2.next.next;
                l1.next = l2.next;
                l2.next.next = l2;
                l2.next = nexts;
                l1 = l2;
                l2 = l2.next;
                
                
        }
        return dumn.next;
    }
}