package com.gokul.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    public class Node{
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        int value;
        Node next;
    }

    public LL() {
        this.size = 0;
    }
}
