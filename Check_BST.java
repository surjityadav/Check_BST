
import java.util.ArrayList;


public class Check_BST 
{
    static Node root;
    static ArrayList<Integer> al=new ArrayList<Integer>();
    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int d)
        {
            key=d;
            left=right=null;
        }
    }
    Check_BST()
    {
        root=null;
    }
    Check_BST(int data)
    {
        root=new Node(data);
    }
    static void insert(int key)
    {
        root=insertItem(root,key);
    }
   static Node insertItem(Node root,int key)
   {
    if(root==null)
    {
        root=new Node(key);
        return root;
    }
    else if(root.key>key)
    {
        root.left=insertItem(root.left,key);
    }
    else
    {
        root.right=insertItem(root.right,key);
    }
        return root;
   }

static public void inOrder(Node temp)
{
if(temp!=null)
{
inOrder(temp.left);
System.out.println(temp.key);
inOrder(temp.right);
}
return;
}
public static boolean check(ArrayList<Integer>a)
{
    for(int i=0;i<a.size()-1;i++)
    {
        if(a.get(i)<a.get(i+1))
        {
            continue;
        }
        else
        {
            return false;
        }
    }
    return true;
}
public static void main(String args[])
{
       Check_BST tree = new Check_BST(100);
       tree.root.left = new Node(90);
       tree.root.right = new Node(80);
       tree.root.left.left = new Node(70);
       tree.root.left.right = new Node(60);
       tree.root.right.left = new Node(50);
       tree.root.right.right = new Node(40);
       System.out.println("THE DATA OF IN-ORDER IS");
        inOrder(root);
        System.out.println();
        if(check(al))
        {
            System.out.println("Tree is BST");
        }
        else
        {
            System.out.println("Tree is not BST");
        }

}
}
