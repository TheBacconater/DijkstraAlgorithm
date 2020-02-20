package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class PriorityQueue {


    int size;
     LinkedList<Node> queue = new LinkedList();



    public PriorityQueue(int size,Object[] arr) {
        //this.size = size;
        for(int i = 0; i < size; i++) {

           // queue.add(new Node((String)arr[i],Integer.MAX_VALUE));
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(String name, int distance) {

        Node insertNode = new Node(name, distance);

        if(queue.isEmpty()) {
            queue.addFirst(insertNode);
        }
        //node is greater than the head.
        if(distance < queue.getFirst().distance) {
            queue.addFirst(insertNode);
        }
        else if(distance > queue.getFirst().distance && distance > queue.getLast().distance) {
                queue.addLast(insertNode);
        }
        else{
           for(int i = 0; i < queue.size();i++) {
               if(distance <queue.get(i).distance) {
                   queue.add(i,insertNode);
               }


           }
        }
        size++;

    }



    public void remove() {
        queue.removeFirst();
        size--;
    }

    public void display() {

        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i).name);
        }
    }

    public boolean isEmpty() {

     if(queue.isEmpty()) {
         return true;
     }
     else {
         return false;
     }
    }

    public Node getFirst() {

            return queue.getFirst();
    }





    static class Node {

        String name;
        int distance;
        Node next;
        Node previous;



        public  Node(String name, int distance) {

            this.name = name;
            this.distance = distance;
            next = null;
            previous = null;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {

            this.previous = previous;
        }


        public void setNext(Node next) {
            this.next = next;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

