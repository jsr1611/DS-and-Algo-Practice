/*
Author: Jumanazar Saidov
Date: 2021.11.08
Link: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
Helpfull resource: https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 */
import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class Solution
{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node pointer1=null, pointer2 = head;
        pointer1 = head;
        while(pointer1 != null && pointer1.next != null){
            pointer2 = pointer1;
            boolean dup = false;
            while(pointer2 != null && pointer2.next != null){
                if(pointer1.data == pointer2.next.data){
                    pointer2.next = pointer2.next.next;
                }
                else{
                    pointer2 = pointer2.next;
                }
            }
            pointer1 = pointer1.next;
        }
        return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}