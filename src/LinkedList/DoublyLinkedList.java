/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 7:56 PM
 */
package LinkedList;

class DoublyNode {
    int data;
    DoublyNode previous;
    DoublyNode next;
    DoublyNode(int data){
        this.data=data;
        previous=next=null;
    }
}
class DoublyMain{
    public static void lengthOfList(DoublyNode head){
        DoublyNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }

        System.out.println("Length of LinkedList " + c);
    }


    public static void printEle(DoublyNode head){
        DoublyNode curr=head;
        if(head==null){
            System.out.println("null");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static DoublyNode reverse(DoublyNode head){
        DoublyNode curr=head;
        if(head==null || head.next==null ){
            return head;
        }
        DoublyNode prev=null;
        while(curr!=null){
            prev=curr.previous;
            curr.previous=curr.next;
            curr.next=prev;
            curr=curr.previous;
        }
        return prev.previous;
    }

    public static DoublyNode insertFirst(DoublyNode head, int data){
        DoublyNode temp= new DoublyNode(data);
        DoublyNode curr=head;
        temp.next=curr;
        curr.previous=temp;
        return temp;

    }

    public static DoublyNode insertLast(DoublyNode head, int data){
        DoublyNode temp=new DoublyNode(data);
        DoublyNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.previous=curr;
        return head;
    }

    public static DoublyNode deleteFirst(DoublyNode head){
        DoublyNode curr=head;
        if(head==null){
            System.out.println("null");
            return curr;
        }
        if(curr.next==null){
            System.out.print("all the elements are deleted now it is = ");
            return null;
        }
        curr=curr.next;
        curr.previous=null;
        return curr;
    }
    public static DoublyNode deleteLast(DoublyNode head){
        DoublyNode curr=head;
        if(curr==null){
            System.out.println("null");
            return curr;
        }
        if(curr.next==null){
            System.out.print("all the elements are deleted now it is = ");
            return null;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.previous.next=null;
        return head ;
    }

    public static DoublyNode deletePos(DoublyNode head, int pos){
        DoublyNode cur=head;
        if(head==null){
            System.out.println("No element present");
            return head;
        }
        if(pos==1 && cur.next==null){
            cur=cur.next;
            return cur;
        }

        for(int i=1;i<=pos-2; i++){
            cur=cur.next;
        }
        cur.next= cur.next.next;
        //cur.next.previous=cur;
        return head;
    }



    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode temp1= new DoublyNode(20);
        DoublyNode temp2 = new DoublyNode(30);
        head.next=temp1;
        head.previous=null;
        temp1.next=temp2;
        temp2.previous=temp1;

        printEle(head);
        System.out.println();

        lengthOfList(head);

        head=reverse(head);
        printEle(head);
        System.out.println("==========================");

        head=insertFirst(head,5);
        printEle(head);
        System.out.println();

        head=insertLast(head,40);
        printEle(head);
        System.out.println();
        head=reverse(head);
        printEle(head);
        System.out.println("==========================");


        lengthOfList(head);

        head=deleteFirst(head);
        printEle(head);
        System.out.println();


        head=deleteLast(head);
        printEle(head);
        System.out.println();


        head=deletePos(head,2);
        printEle(head);
        System.out.println();
        head=deletePos(head,1);
        printEle(head);
        System.out.println();
        head=deletePos(head,1);
        printEle(head);
        System.out.println();


    }
}