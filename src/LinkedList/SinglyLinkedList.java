/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/11/2021
 *  Time: 8:00 PM
 */
package LinkedList;

class NodeSingly {
    int data;
    NodeSingly next;
    NodeSingly(int data){
        this.data=data;
        next=null;
    }
}
class SinglyMain{
    public static void printList(NodeSingly head){ //Here Complexity is O(n)
        NodeSingly curr=head;
        if(head==null){
            System.out.println("null");
        }
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static NodeSingly insertFirst(NodeSingly head, int data){
        NodeSingly cur= new NodeSingly(data);
        NodeSingly temp;
        if(head==null){
            return cur;          // Here Complexity is Big O(1) or theta(1)
        }
        temp=head;
        head=cur;
        cur.next=temp;
        return cur;
    }

    public static NodeSingly insertLast(NodeSingly head, int data){
        NodeSingly temp=new NodeSingly(data);
        NodeSingly cur= head;
        if(cur== null){              //Here Complexity is O(n)
            return temp;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=temp;
        temp.next=null;
        return head;
    }

    public static NodeSingly deleteFirst(NodeSingly head){
        NodeSingly temp=head;
        head=head.next;                        //Here Complexity is theta(1) or Big O(n)
        return head;
    }

    public static NodeSingly deleteLast(NodeSingly head){
        NodeSingly temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
            //Here Complexity is Big O(n)
        }
        temp.next=null;
        return head;
    }

    public static NodeSingly insertPos(NodeSingly head, int data , int pos){
        NodeSingly cur=head;
        NodeSingly temp=new NodeSingly(data);              //Here Complexity is Big O(n) sometimes sometimes , it may be
        if(pos==1 && head==null){               // O(1)
            return temp;
        }

        for(int i=1                   ;i<=(pos)-2;i++){
            if(cur==null){
                System.out.println("This position is not valid");
                return head;
            }
            cur=cur.next;
        }
        //cur.next=temp;
        temp.next= cur.next;
        cur.next=temp;
        return head;
    }

    public static NodeSingly deletePos(NodeSingly head, int pos){  //Here Complexity is Big O(n) sometimes sometimes ,
        // it may be O(1)
        NodeSingly cur=head;
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
        return head;
    }

    public static void search(NodeSingly head, int data){
        NodeSingly searchingNode= new NodeSingly(data);
        NodeSingly cur=head;
        int count=0;
        int j=0;
        if(cur==null){
            System.out.println("No element is present");
        }
        else{
            while(cur!=null){
                count++;
                if(cur.data ==searchingNode.data){
                    j=1;
                    System.out.println("yes, " + searchingNode.data + " is present at pos" + count );
                    break;
                }
                cur=cur.next;
            }
            if(j==0){
                System.out.println(searchingNode.data +" not present");
            }


        }

    }

    public static void main(String[] args) {
        NodeSingly head= null;
        head= new NodeSingly(10);
        head.next=new NodeSingly(20);
        head.next.next=new NodeSingly(30);

        printList(head);

        head=insertFirst(head,5);
        head=insertFirst(head, 4);
        System.out.println("-------------------");

        printList(head);

        head=insertLast(head,35);
        System.out.println("--------------------");
        printList(head);
        head=deleteFirst(head);
        //head=deleteFirst(head);
        printList(head);
        System.out.println("----------------------");

        head=deleteLast(head);
        printList(head);
        System.out.println("---------------------");
        System.out.println("insert");
        head=insertPos(head,7,2);
        printList(head);
        System.out.println("-------------------------");

        //System.out.println("###########################");

        head=deletePos(head,3);
        printList(head);
        System.out.println("---------------------------");
        /*
        head=deletePos(head,2);
        printList(head);
        head=deletePos(head,2);
        printList(head);

        head=deletePos(head,1);
        printList(head);

         */

        search(head,50);
        search(head,30);
    }


}
