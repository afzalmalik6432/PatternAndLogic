package com.oops;

class Node{
    int val;
    Node next;
    
    Node(int data){
        this.val = data;
        this.next = null;
    }
}

class LinkedListImpl{
    Node head;
    
    LinkedListImpl(){
        this.head = null;
    }
    
    void print(){
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    
    void insertAtEnd(int num){
        Node cur = this.head;
        if(cur==null) //if LL is empty
            this.head = new Node(num);
        else{
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = new Node(num);
        }
    }

     int findNode(int n){
        Node currentNode = this.head;
        int pos = 1;
        while(pos<n){
            currentNode = currentNode.next;
            pos++;
        }
        return currentNode.val;
    }

    int findlength(){
        Node currentNode = this.head;
        int len = 0;
        while(currentNode!=null){
            currentNode = currentNode.next;
            len++;
        }
        return len;
    }
}

public class Solution {
    public static void main(String[] args) {
        
        LinkedListImpl list = new LinkedListImpl();
        list.head = new Node(5);
        list.head.next = new Node(7);
        list.head.next.next = new Node(1);
        // System.out.println(list.head.val);
        
        list.print();
        
        int num = 4;
        list.insertAtEnd(num);
        
        list.print();
        System.out.println(list.findNode(3)+" is the element");
        System.out.println(list.findlength()+" is length");
    }
}
