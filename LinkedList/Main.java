package LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.Insert(5);//5
        ll.Insert(10);//5,10
        ll.Insert(15);//5,10,15
        ll.Insert(20);//5,10,15,20
        ll.Insert(25);//5,10,15,20,25
        ll.Show();
        System.out.println("---------");
        ll.InsertHead( 0);//0,5,10,15,20,25
        ll.Show();
        System.out.println("---------");
        ll.InsertAt(30,4);//0,5,10,15,30,20,25
        ll.Show();
        System.out.println("---------");
        ll.Delete(4);//0,5,10,15,20,25
        ll.Show();
    }
}
