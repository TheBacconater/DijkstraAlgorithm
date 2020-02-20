package com.company;

import java.util.LinkedList;

public class QueueLL<Generic> {


   LinkedList list = new LinkedList();



    public Generic enqueue(Generic data) {

        list.add(data);

        return data;

    }

    public Generic dequeue() {
       Generic returnStatement = (Generic) list.get(0);
        list.remove(0);

        return returnStatement;


    }


    public Generic peek()
    {
        return (Generic) list.get(0);
    }

    public void display()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

    public int size() {

        return list.size();

    }

    public boolean isEmpty() {

        if(list.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }











}



/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */