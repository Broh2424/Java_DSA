package dsa.LinkedList;

public class Operations {





    public void DeleteAt(int index, Node head){
        if(index==0&& head!=null){
            head=head.next;
            return;
        }
        Node temp= head;
        for(int i=0;i<index-1;i++)
            temp=temp.next;

        if(temp==null||temp.next==null)
            System.out.println("Index is out of bound");
        temp.next=temp.next.next;
    }
}
