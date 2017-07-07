import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
static void levelOrder(Node root){
      //Write your code here
    if (root != null){
        LinkedList queue = new LinkedList();
        Node aux;
        queue.addLast(root);
        int q_size = 1;
        while ( q_size > 0  ){
            aux = (Node)queue.remove(0);
            System.out.print( aux.data + " ");
            q_size--;
            if (aux.left != null){
                queue.addLast(aux.left);
                q_size++;
            }
            if (aux.right != null){
                queue.addLast(aux.right);
                q_size++;
            }
            
        }
        
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
            levelOrder(root);
        }	
}
