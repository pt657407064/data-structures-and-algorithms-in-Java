/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author taopa
 */
public class Tree {
    
    Node root;
    
    public void insert(Node node){
        if(root == null){
            root = node;
        }    
        else{
            Node focusNode = root;
            Node parent;
           while(true){
               parent = focusNode;
               if(node.key < focusNode.key){
                   focusNode = focusNode.LeftChild;
                   if(focusNode == null){
                       parent.LeftChild = node;
                       return;
                   }
               }else{
                   focusNode = focusNode.RightChild;
                   if(focusNode==null){
                       parent.RightChild = node;
                       return;
                   }
               }
           }      
        }
    } 
    public void displayInOrderTraverse(Node node){
        if(node != null){
        displayInOrderTraverse(node.LeftChild);
        System.out.println(node);
        displayInOrderTraverse(node.RightChild);
        }
    }
     public void displayPreOrderTraverse(Node node){
        if(node != null){
        System.out.println(node);
        displayPreOrderTraverse(node.LeftChild);
        displayPreOrderTraverse(node.RightChild);
        }
    }   
    
      public void displayPostOrderTraverse(Node node){
        if(node != null){
        displayPostOrderTraverse(node.LeftChild);
        displayPostOrderTraverse(node.RightChild);
        System.out.println(node);
        }
    }
    public Node search(Node node){
        Node focusNode = root;
        while(focusNode != null){
            if(focusNode.key == node.key)
            {
                return focusNode;
            }
            else{
                if(focusNode.key > node.key){
                    focusNode = focusNode.LeftChild;
                }
                else{
                    focusNode = focusNode.RightChild;
                }
                    
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(new Node(50,"Boss"));
        t.insert(new Node(100,"manager"));
        t.insert(new Node(75,"vp"));
        t.insert(new Node(25,"developer"));
        t.insert(new Node(10,"QA"));
        t.insert(new Node(35,"BA"));
        t.insert(new Node(5,"Tao"));
        t.insert(new Node(15,"pan"));
        t.insert(new Node(30,"Xin"));
        t.displayInOrderTraverse(t.root);
        System.out.println();
        t.displayPreOrderTraverse(t.root);
        System.out.println();
        t.displayPostOrderTraverse(t.root);
        
        System.out.println("Found"+ t.search(new Node(25,"developer")));
        
    }
    
}
class Node{
    Node LeftChild;
    Node RightChild;
    int key;
    String value;
    public Node(int key, String value){
        this.key = key;
        this.value = value;
    }

    public Node getLeftChild() {
        return LeftChild;
    }

    public void setLeftChild(Node LeftChild) {
        this.LeftChild = LeftChild;
    }

    public Node getRightChild() {
        return RightChild;
    }

    public void setRightChild(Node RightChild) {
        this.RightChild = RightChild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String toString(){
        return "Key: "+key+" Value: " + value;
    }
}
