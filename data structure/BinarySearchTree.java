public class BinarySearchTree {

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
    
    public void deleteNode(int key){
        if(root == null) return;
        if(root.key == key){
            if(root.LeftChild== null && root.RightChild == null) root = null;
            else if(root.LeftChild != null && root.RightChild == null) root = root.LeftChild;
            else if(root.LeftChild == null && root.RightChild != null) root = root.RightChild;
            else {
                Node tem = root.LeftChild;
                root = root.RightChild;
                Node focusNode = root;
                while(focusNode.LeftChild != null){
                    focusNode = focusNode.LeftChild;
                }
                focusNode.LeftChild = tem;
            }
        }
        Node focusNode = root;
        Node parent = null;

        while(focusNode != null){
            if(focusNode.key == key){
                if(key < parent.key) {
                    if (focusNode.LeftChild == null && focusNode.RightChild == null) parent.LeftChild = null;
                    else if (focusNode.LeftChild == null && focusNode.RightChild != null)
                        parent.LeftChild = focusNode.RightChild;
                    else if (focusNode.LeftChild != null && focusNode.RightChild == null)
                        parent.LeftChild = focusNode.RightChild;
                    else {
                        Node tem = focusNode.LeftChild;
                        focusNode = focusNode.RightChild;
                        parent.LeftChild = focusNode;
                        while(focusNode.LeftChild !=null){
                            focusNode = focusNode.LeftChild;
                        }
                        focusNode.LeftChild = tem;
                    }
                }
                else{
                    if(focusNode.LeftChild == null && focusNode.LeftChild == null) parent.RightChild = null;
                    else if (focusNode.LeftChild == null && focusNode.RightChild != null)
                        parent.RightChild = focusNode.RightChild;
                    else if(focusNode.LeftChild!=null && focusNode.RightChild == null) parent.RightChild =focusNode.LeftChild;
                    else{
                        Node tem = focusNode.LeftChild;
                        focusNode = focusNode.RightChild;
                        parent.LeftChild = focusNode;
                        while(focusNode.LeftChild !=null){
                            focusNode = focusNode.LeftChild;
                        }
                        focusNode.LeftChild = tem;
                    }
                }
            }
            else if(key > focusNode.key){
                parent = focusNode;
                focusNode = focusNode.RightChild;
            }
            else{
                parent = focusNode;
                focusNode = focusNode.LeftChild;
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
    public Node search(int key){
        Node focusNode = root;
        while(focusNode != null){
            if(focusNode.key == key)
            {
                return focusNode;
            }
            else{
                if(focusNode.key > key){
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
        BinaryTree t = new BinaryTree();
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
        System.out.println();
        t.deleteNode(50);
        t.displayPostOrderTraverse(t.root);
        System.out.println("Found "+ t.search(50));

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
    public String toString(){
        return "Key: "+key+" Value: " + value;
    }
}
