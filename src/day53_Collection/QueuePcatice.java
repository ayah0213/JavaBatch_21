package day53_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePcatice {

    public static void main(String[] args) {

        Queue<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,12,3,54,67,1,2,3,4));
        System.out.println(arrayDeque);
        arrayDeque.addAll(Arrays.asList(4,8,6,5));
        arrayDeque.poll();// removes 10(firdst in first out)
        System.out.println(arrayDeque);
        arrayDeque.poll();// remove 12
        System.out.println(arrayDeque);


        // here we downcatsing to call through reference type ArrayDeque
       int num1= (Integer) ((ArrayDeque) arrayDeque).getFirst();
        System.out.println(num1);
        System.out.println(  ((ArrayDeque)arrayDeque).getLast());/// get last num

        Queue<Integer> priorityQue= new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(10,12,14,3,2,2));
        System.out.println("priority = "+priorityQue);
        priorityQue.poll();
        priorityQue.poll();
        System.out.println("priorityQue: "+priorityQue);



    }
}
