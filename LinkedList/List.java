
class Node{
    int val;
    Node next;
    Node(int val){ //constructor
        this.val = val;
    }
}
public class List {
    public static void Display(Node Head) {
        Node temp = Head; //temperory pointer to the head as it is the starting of our list
        while(temp!= null){
            System.out.println(temp.val);
            temp = temp.next; //moving forward the temp 
        }   
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        a.next = b;
        b.next = c;
        Display(a);
    }
}