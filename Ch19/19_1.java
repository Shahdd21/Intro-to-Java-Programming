import java.math.BigInteger;
import java.util.* ;
import java.io.* ;

public class Demo {

    public static void main(String[] args) {

        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.length());

        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println(stack.length());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}

class GenericStack<E>{

    private int capacity = 5;
    private int size = 0 ;
    E[] arr = (E[])new Object[capacity];

    public int length(){
        return size;
    }

    public void push(E element){

        if(size == capacity){
            E[] temp = (E[])new Object[size*2];
            System.arraycopy(arr,0,temp,0,size);
            arr = temp;
        }

            arr[size] = element;
            ++size;
    }

    public E pop(){
        E top = arr[size-1];
        --size;

        return top;
    }

    public E peek(){
        return arr[size-1];
    }

    public boolean empty(){
        return size == 0;
    }
}
