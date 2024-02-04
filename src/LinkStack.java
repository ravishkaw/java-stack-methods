class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

 class LinkStack {
    public static Node head;
    public static Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        } else {
            Node temp = head;
            head = head.next;
            System.out.println(temp.data + " got popped!");
        }
    }
     public void peek(){
         if(isEmpty()){
             System.out.println("Underflow");
         } else {
             System.out.println(head.data);
         }
    }


    public void print(){
        if (isEmpty()){
            System.out.println("Underflow");
        } else {
            for(Node temp = head; temp != null; temp = temp.next){
                System.out.print(temp.data + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        LinkStack myStack = new LinkStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(70);
        myStack.push(30);
        myStack.print();
        myStack.pop();
        myStack.print();
        myStack.peek();
    }
}
