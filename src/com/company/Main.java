package com.company;
import java.util.Scanner;
class queue
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node f=null;
    Node r=null;
    public void enqueue(Scanner sc)
    {
        System.out.print("enter the data:");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(f==null)
        {
            f=new_node;
            r=new_node;
        }
        else
        {
            r.next=new_node;
            r=new_node;
        }
    }
    public void dequeue()
    {
        if(f==null)
        {
            System.out.print("underflow condition");
        }
        else
        {
            f=f.next;
        }
    }
    public void display()
    {
        Node temp=f;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        int d;
        Scanner sc=new Scanner(System.in);
        queue s=new queue();
        int l;
        do
            {
              System.out.println("press 1 to enqueue");
                System.out.println("press 2 to dequeue");
                System.out.println("press 3 to display");
                System.out.println("enter yur choice:");
                d=sc.nextInt();
                switch(d)
                {
                    case 1:
                    {
                        s.enqueue(sc);
                        break;
                    }
                    case 2:
                    {
                        s.dequeue();
                        break;
                    }
                    case 3:
                    {
                        s.display();
                        break;
                    }
            }
            System.out.print("enter 0 to go back to main menu:");
                System.out.print("enter any key to exit:");
                l=sc.nextInt();
        }while(l==0);
        System.out.print("Exit successfully");
	// write your code here
    }
}
