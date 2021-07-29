/*
* Name: Kalil Black
* Date: 3 March 2021
* Question number: 1
* Description: Uses doubles in place of ints
*/
public class BSTReferenceBased { 
    //node class that defines BST node
    class Node { 
        String key;// unique key
        Person p;
        Node leftChild, rightChild;  // references to the left and right child
       
        public Node(String k, Person p){ 
            key = k; 
            this.p = p;
            leftChild = rightChild = null; 
        } 
    } 
   
    Node root; // entry point to the BST (reference to root node)
  
   // Constructor for BST =>initial empty tree
    BSTReferenceBased(){ 
        root = null; 
    } 
    
     Node search(String key)  { 
        return searchRec(root, key); 
    } 
   
    //recursive search function
    Node searchRec(Node root, String key)  { 
      // base case: root is null or key presents at root
        if (root==null || root.key.equals(key)) 
            return root; 
       //value is less than root's key
        if ( key.compareTo(root.key) < 0) 
            return searchRec(root.leftChild, key); 
      // value is greater than root' key
        return searchRec(root.rightChild, key); 
    } 
    
     
     // insert a node in BST 
    void insert(String key, Person p)  { 
        root = insertRec(root, key, p);  // internal call to recursive implementation
            } 
   
    //recursive insert function
    Node insertRec(Node root, String key, Person p) { 
          // check if input BST is empty
        if (root == null) { 
         // Input BST is empty: create new node storing input key, return it as the new input BST root.
            root = new Node(key, p); 
            return root; 
        } 
         // Input BST is not empty: compare input item with currRoot, and proceed insertion.
        if (key.compareTo( root.key ) < 0)     
            root.leftChild = insertRec(root.leftChild, key, p);  // insert in the leftchild subtree
        else if (key.compareTo( root.key ) > 0)    
            root.rightChild = insertRec(root.rightChild, key, p); // insert in the rightchild subtree
          // return pointer
        return root; 
    } 
    
       
    String s = "";    
    public String preorder() {
        s = ""; 
        preorderRec(root);
        return s; 
    } 
   
    void preorderRec(Node root)
    { 
        if (root == null) {
        return; }
        else {
        s += root.key + "," + root.p.number + "\n"; 
        preorderRec(root.leftChild); 
        preorderRec(root.rightChild); 
    } } }