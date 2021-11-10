package HackerRank;/*
Author: Jumanazar Saidov
Date: 2021.11.06
Link: https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 */
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    public static int getHeight(Node root){
        //Write your code here
        if(root.left == null && root.right != null){
            return 1 + Math.max(0, getHeight(root.right));
        }
        else if(root.right == null && root.left != null){
            return 1 + Math.max(getHeight(root.left), 0);
        }
        if(root.right == null && root.left == null){
            return 0;
        }
        else{
            return 1+(Math.max(getHeight(root.left), getHeight(root.right)));
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}