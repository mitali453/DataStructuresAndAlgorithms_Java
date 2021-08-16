/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 7:55 PM
 */
package LinkedList;


class CircularNode{
    int data;
    CircularNode next;
    CircularNode(int x){
        data=x;
        next=null;
    }

}

class CircularMain{
    public static void printEle(CircularNode head){
        CircularNode curr=head;
        if(curr==null){
            System.out.println("Empty List");
        }
        System.out.print(curr.data+" ");
        curr=curr.next;
        while(curr!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static CircularNode insertFirst(CircularNode head,int data){
        CircularNode temp=new CircularNode(data);
        if(head==null){
            temp.next=temp;
        }
        else{
            CircularNode curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;

        }
        return temp;
    }

    public static CircularNode insertLast(CircularNode head,int data){
        CircularNode temp=new CircularNode(data);
        if(head==null){
            temp.next=temp;
        }
        else{
            CircularNode curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
        }
        return head;
    }

    public static CircularNode deleteFirst(CircularNode head){
        CircularNode curr=head;
        if(head==null || head.next==head){
            return null;
        }
        else{
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=head.next;

        }
        return head.next;
    }

    public static CircularNode deleteLast(CircularNode head){
        CircularNode curr=head;
        if(curr==null || curr.next==null){
            System.out.println("empty");
            return null;

        }

        while(curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;


        return head;
    }
    public static boolean detectLoopUsingFloydsMethod(CircularNode head){
        CircularNode slow_p = head;
        CircularNode fast_p = head;
        while(fast_p!=null || fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    public static void detectionAndRemovalOfLoop(CircularNode head){
        CircularNode slow_p = head;
        CircularNode fast_p = head;
        while(fast_p!=null && fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                break;
            }
        }
        if(slow_p!=fast_p){
            return;
        }
        slow_p=head;
        while(slow_p.next!=fast_p.next){
            slow_p=slow_p.next;
            fast_p=fast_p.next;
        }
        fast_p.next=null;

    }






    public static void main(String[] args) {
        CircularNode head=new CircularNode(10);
        head.next= new CircularNode(20);
        head.next.next= new CircularNode(30);
        head.next.next.next= new CircularNode(40);
        head.next.next.next.next= head;

        printEle(head);
        System.out.println();

        head=insertFirst(head,5);
        printEle(head);
        System.out.println();

        head=insertLast(head,50);
        printEle(head);
        System.out.println();

        head= deleteFirst(head);
        printEle(head);
        System.out.println();

        head= deleteFirst(head);
        printEle(head);
        System.out.println();

        head=deleteLast(head);
        printEle(head);
        System.out.println();

        boolean isLoopthere = detectLoopUsingFloydsMethod(head);
        if(isLoopthere==true){
            System.out.println("Yes, It contains loop");
        }
        else{
            System.out.println("No , It does not contain loop");
        }
        detectLoopUsingFloydsMethod(head);
        printEle(head);
        boolean isLoopther = detectLoopUsingFloydsMethod(head);
        if(isLoopther==true){
            System.out.println("Yes, It contains loop");
        }
        else{
            System.out.println("No , It does not contain loop");
        }
    }
}
