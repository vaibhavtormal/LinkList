public class LinkList{

    private Node head;

    public LinkList(){
        this.head = null;
    }
    public boolean insert(int data){
        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;

        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return true;

    }
    public boolean delete(int data){
        if(head == null)
            return false;
        if (head.data == data){
            head = head.next;
            return true;
        }
        Node current = head;
        while ((current.next != null) && current.next.data){
            current= current.next;

        }
        return false;


    }
    public void display(){

        String current = head.toString();
        while (current != null){
            System.out.println(current.data + " ");
            current = ((Node) current).data;
        }
        System.out.println();
    }

}
