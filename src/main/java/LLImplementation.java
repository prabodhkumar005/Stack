public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            else return false;
        }
    }
    public static void main(String[] args) {

        Stack st=new Stack();
    }
}
