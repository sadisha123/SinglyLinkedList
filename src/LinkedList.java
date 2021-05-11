public class LinkedList {
    Node head;

    pulic void add(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null) {
           head = node;
        }
        else{
            Node n = head;
            while(n.next != null)
            {
                n=n.next

            }
            n.next = node;
        }

    }

    add(int index, int number){}

    remove(int index){}

    get(int index){}

    print(){}

    clear(){}

    size(){}

    contains(int number){}

    empty(){}

}
