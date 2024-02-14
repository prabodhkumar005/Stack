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
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }


        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
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
        LLStack stack=new LLStack();
        stack.push(4);
        stack.display();
        stack.push(5);
        stack.display();
        stack.push(6);
        stack.display();
        System.out.println(stack.size());
        stack.pop();
        stack.display();
        System.out.println(stack.size());
        stack.push(7);
        stack.push(8);
        stack.display();
    }
}
