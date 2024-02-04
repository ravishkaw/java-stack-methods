public class Stack {
    public int[] myArray = new int[5];
    public static int top = -1;
    public int n = myArray.length;

    public boolean isFull() {
        return top == n - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            ++top;
            myArray[top] = val;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            int temp = myArray[top];
            --top;
            System.out.println(temp + " got deleted!");
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Underflow");
        } else {
            System.out.println(myArray[top]);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Underflow");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(20);
        myStack.push(60);
        myStack.push(10);
        myStack.print();
        myStack.peek();
        myStack.pop();
        myStack.peek();
        myStack.print();
    }
}