
/*
Author: Jumanazar Saidov
Date: 2021.11.01
Link: https://www.hackerrank.com/challenges/30-linked-list/problem
 */

package HackerRank;

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method

        if(head != null){
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
        else{
            head = new Node(data);
        }
        return head;

    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}