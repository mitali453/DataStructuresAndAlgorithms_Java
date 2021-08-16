/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 7:58 PM
 */
package LinkedList;

public class FloatLinkedList {
    float data;
    FloatLinkedList next;
    FloatLinkedList(float data){
        this.data=data;
        next=null;
    }
}

class FloatMain{
    public static void median(FloatLinkedList head){
        FloatLinkedList curr=head;
        float c=0;
        while (curr!=null){
            c++;
            curr=curr.next;
        }
        System.out.println("Length of Linked List is : " + (int)c);

        float mid = (float) Math.ceil(c/2);
        System.out.println("Middle element position is: " + (int)mid);
        FloatLinkedList temp=head;
        for(int i=1;i<mid;i++){
            if(temp!=null){
                temp=temp.next;
                //System.out.println(curr.data);
            }
            else{
                System.out.println("Your list is empty");
            }
        }
        System.out.println("Median is : "+temp.data);

    }

    public static void display(FloatLinkedList head){
        FloatLinkedList curr=head;
        while(curr!=null) {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
    public static float sum(FloatLinkedList head){
        FloatLinkedList curr=head;
        float s=0f;
        while(curr!=null){
            s = s + curr.data;
            curr=curr.next;
        }
        return s;
    }
    public static void mean(FloatLinkedList head){
        FloatLinkedList curr=head;
        float a= sum(head);
        //System.out.println(a);
        int c=0;
        while (curr!=null){
            c++;
            curr=curr.next;
        }
        System.out.println("Average of Linked List = " + a/c);

    }
    public static void max(FloatLinkedList head){
        FloatLinkedList curr=head;
        float max=head.data;
        while(curr!=null){
            if(curr.data>max){
                max=curr.data;
            }
            curr=curr.next;
        }
        System.out.println("Maximum of the Linked List "+ max);

    }

    public static void min(FloatLinkedList head){
        FloatLinkedList curr=head;
        float min=head.data;
        while(curr!=null){
            if(curr.data<min){
                min=curr.data;
            }
            curr=curr.next;
        }
        System.out.println("Minimum of the Linked List "+ min);

    }
    public static void elementPos(float data , FloatLinkedList head){
        FloatLinkedList temp = new FloatLinkedList(data);
        FloatLinkedList curr=head;
        int c=0;
        if(curr==null){
            System.out.println("sorry , no element is present");
        }
        while(curr!=null){
            c++;
            if(curr.data==temp.data){
                System.out.println(curr.data+ " is present at position "+ c);
                return;
            }
            curr=curr.next;
        }
        System.out.println(temp.data +" ,No such element is present");
    }

    public static FloatLinkedList sortedInsert(FloatLinkedList head, float data){
        FloatLinkedList temp= new FloatLinkedList(data);
        FloatLinkedList curr=head;
        if(temp.data<head.data){
            temp.next=head;
            return temp;
        }
        while(curr.next!=null && curr.next.data<temp.data){
            curr=curr.next;
        }

        temp.next=curr.next;
        curr.next=temp;
        return head;

    }
    public static void getNthLastElement(FloatLinkedList head, int k){
        FloatLinkedList curr=head;
        FloatLinkedList temp=head;
        int c=0;
        int co=0;
        while (curr!=null){
            c++;
            curr=curr.next;
        }
        if(c<k){
            System.out.println("Element crosses the boundary it exceeds the length of list");
            return;
        }
        if(k<1){
            System.out.println("TRY AGAIN!! Please give the value of k from 1 to the list length only");
            return;
        }

        for(int i=1;i<(c-k+1);i++){
            if(temp!=null) {
                temp = temp.next;
            }
            else{
                System.out.println("null");
            }
        }
        System.out.println("Last "+ k+ " element is: "+ temp.data);

    }
    public static FloatLinkedList reverse(FloatLinkedList head) {
        if(head==null || head.next==null){
            return head;
        }
        FloatLinkedList rest_head=reverse(head.next);
        FloatLinkedList rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }

    public static FloatLinkedList removeDuplicate(FloatLinkedList head){
        FloatLinkedList curr=head;
        if(head==null || head.next==null){
            return head;
        }
        while(curr.next!=null){
            if(curr.data==curr.next.data){

                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static boolean detectLoopUsingFloydsMethod(FloatLinkedList head){
        FloatLinkedList slow_p = head;
        FloatLinkedList fast_p = head;
        while(fast_p !=null && fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    public static void deleteNodeWithoutHeadUsingPointer(FloatLinkedList node){
        //for sure it never be the last node.
        node.data=node.next.data;
        node.next=node.next.next;
    }
    public static void evenAndOdd(FloatLinkedList head){
        /*
        In this we want that our LinkedList odd and even both types  of number but we want
        that all the elements that are even comes at first and odd at last and the element
        position is acc to their sequence.
         */
        FloatLinkedList eS=null;
        FloatLinkedList eE=null;
        FloatLinkedList oS=null;
        FloatLinkedList oE=null;
        for(FloatLinkedList curr=head;curr!=null;curr=curr.next) {
            float x = curr.data;
            if (x % 2 ==(float) 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eE.next = curr;
                    eE = eE.next;
                }
            }
            else{
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                } else {
                    oE.next = curr;
                    oE = oE.next;
                }

            }
        }
        if(oS==null || eS==null){
            return;
        }
        eE.next=oS;
        oE.next=null;

        head=eS;
    }





    public static void main(String[] args) {
        FloatLinkedList head=new FloatLinkedList(1.5f);
        head.next=new FloatLinkedList(2.5f);
        //System.out.println("+++++++++"+head.next);
        head.next.next=new FloatLinkedList(2.8f);
        head.next.next.next=new FloatLinkedList(4.5f);

        System.out.print("Linked List: ");
        display(head);
        System.out.println();

        System.out.println("Sum of Linked List = " + sum(head));
        mean(head);

        System.out.print("even and odd ; ");
        evenAndOdd(head);
        display(head);
        System.out.println();

        min(head);

        elementPos(5.5f, head);
        elementPos(2.5f, head);

        median(head);

        System.out.print("Sorted Insert: ");
        head=sortedInsert(head,2.8f);
        display(head);
        System.out.println();

        getNthLastElement(head,2);

        head = reverse(head);
        System.out.print("Reverse of Linked list is: ");
        display(head);
        System.out.println();

        head=removeDuplicate(head);
        System.out.print("Linklist without duplicate :");
        display(head);
        System.out.println();

        boolean isLoopthere = detectLoopUsingFloydsMethod(head);
        if(isLoopthere){
            System.out.println("Yes, It contains loop");
        }
        else{
            System.out.println("No , It does not contain loop");
        }
        deleteNodeWithoutHeadUsingPointer(head.next);
        System.out.print("DeleteNode "+head.next.data + " without using head: ");
        display(head);
        System.out.println();

    }
}


