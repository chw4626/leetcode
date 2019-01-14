class MyLinkedList {
    class Node {
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
            }
        }
    private Node head;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size)
            return -1;
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node pre = head;
        head = new Node(val);
        head.next = pre;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        size++;
        if (head == null) {
            head = node;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
        }
        else{
            Node node = new Node(val);
            size++;
            Node curr = head;
            for(int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= size) return;
        size--;
        Node curr = head;
        for(int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
        curr.next = curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */