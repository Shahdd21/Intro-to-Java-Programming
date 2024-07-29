import java.util.Date;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        QueueOfIntegers q = new QueueOfIntegers();

        for(int i = 0 ; i < 20 ; ++i)
            q.enqueue(i+1);
        
        while(!q.empty())
            System.out.print(q.dequeue() + " ");
    }
}
public class QueueOfIntegers {
   private int[] elements;
   private int size;
   public static final int DEFAULT_SIZE = 8;

   public QueueOfIntegers() {
       elements = new int[DEFAULT_SIZE];
   }

   public void enqueue(int value)
   {
      if(size >= elements.length)
      {
          int[] temp = new int[elements.length*2];
          System.arraycopy(elements,0,temp,0,elements.length);
          elements = temp;
      }

       elements[size++] = value;
   }

   public int dequeue()
   {
       int first = elements[0];
       --size;
       int[] temp = new int[elements.length-1];
       System.arraycopy(elements,1,temp,0,size);
       elements = temp;

       return  first;
   }

   public boolean empty() {
        return size == 0;
   }

   public int getSize()
   {
       return size;
   }
}
