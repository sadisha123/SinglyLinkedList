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

    public void add(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index==0){
            insertAtStar(data);
        }else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void remove(int index){}

    get(int index){}

    print(){}

    clear(){}

    size(){}

    contains(int number){}

    empty(){}

}
