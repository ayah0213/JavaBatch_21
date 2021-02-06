package day53_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 3, 5, 6, 7, 8, 8, 3, 10, 11, 12, 23));
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list);


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 3, 5, 6, 7, 8, 8, 3, 10, 11, 12,1,2,0,1,3, 23));
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            if (it.next()< 5){
                it.remove();
            }
        }
        // another way of removing
       // list1.removeIf(p->p<5);
        System.out.println("-------------------------");
    }
}