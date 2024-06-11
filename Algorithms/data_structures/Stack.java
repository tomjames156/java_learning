package data_structures;

import java.util.*;

public class Stack {
    private List<Integer> list;

    public Stack(List<Integer> _list){
        list = _list;
    }

    public boolean isEmpty(){
        int size = list.size();
        if(size > 0){
            return false;
        }else{
            return true;
        }
    }

    public int peek(){
        if(list.size() > 0){
            int top = list.get(list.size() - 1);
            System.out.println("Top: " + top);
            return top;
        }else{
            System.out.println("Stack Underflow");
            return 0;
        }
        
    }

    public void push(int val){
        list.add(val);
    }

    public int pop(){
        if(list.size() > 0){
            int topIndex = list.size() - 1;
            int top = list.get(topIndex);
            list.remove(topIndex);
            return top;
        }else{
            System.out.println("Stack Underflow");
            return 0;
        }  
    }
    
    public static void main(String[] args){
        List<Integer> numbersList = new LinkedList<Integer>();
        Stack linkedListStack = new Stack(numbersList);

        System.out.println(linkedListStack.list);
        System.out.println("isEmpty: " + linkedListStack.isEmpty());
        linkedListStack.push(34);
        linkedListStack.peek();

        linkedListStack.push(15);
        linkedListStack.pop();
        linkedListStack.pop();
        linkedListStack.peek();
    }
}
