public class MyLinkedList<E> {
    Node node1;
    Node node2;

    class Node{
        Node next;
        E value;


        public Node(E value) {
            this(value,null);
        }
        public Node(E value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    void add (E value){
        if (node1 == null) {
            node1 = new Node(value);
        }
        else{
            node2 = new Node(value,node1);
            node1 = node2;
        }
    }
    void getAll(){

        do{
            E value = node1.value;
            node1 = node1.next;
            System.out.println(value);
        }while (node1.next!=null);

    }
}
