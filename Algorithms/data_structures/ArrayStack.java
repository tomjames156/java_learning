package data_structures;

public class ArrayStack {
    int[] stack;

    public ArrayStack(int[] _stack){
        stack = _stack;
    }

    public int size(){
        int num = 0;
        for(int i = 0; i < stack.length; i++){
            if(stack[i] != 0){
                num++;
            }
        }
        return num;
    }

    public boolean isEmpty(){
        if(this.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        int currentLength = this.size();
        int top;
        if(currentLength > 0){
            top = stack[currentLength - 1];
            System.out.println("Top: " + top);
            return top;
        }else{
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public void push(int val){
        int currentLength = this.size();
        int maxLength = stack.length;
        if(currentLength < maxLength){
            stack[currentLength] = val;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop(){
        int poppedValue;
        int currentLength = this.size();

        if(currentLength > 0){
            poppedValue = stack[currentLength - 1];
            stack[currentLength - 1] = 0;
        }else{
            System.out.println("Stack Underflow");
            return -1;
        }

        return poppedValue;
    }

    public void showStack(){
        System.out.print("\n");
        for(int number : stack){
            System.out.print("\t" + number);
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        int[] myNumbers = new int[5];
        ArrayStack gradeStack = new ArrayStack(myNumbers);
        System.out.println("isEmpty: " + gradeStack.isEmpty());
        gradeStack.showStack();
        System.out.println("Length: " + gradeStack.size());
        gradeStack.push(10);
        gradeStack.showStack();
        gradeStack.push(20);
        gradeStack.showStack();
        gradeStack.push(5);
        gradeStack.showStack();
        gradeStack.push(4);
        gradeStack.showStack();
        gradeStack.push(9);
        gradeStack.showStack();
        System.out.println("The number " +  gradeStack.pop() + " was removed from the stack" );
        gradeStack.showStack();
        System.out.println("Length: " + gradeStack.size());
        gradeStack.push(44);
        gradeStack.showStack();
        gradeStack.peek();

        System.out.println("isEmpty: " + gradeStack.isEmpty());

    }
}
