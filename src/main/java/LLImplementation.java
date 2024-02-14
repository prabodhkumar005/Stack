public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {

        Stack st=new Stack();
    }
}
