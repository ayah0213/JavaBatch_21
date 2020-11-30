package day34_ArrayListContinue;

import java.util.ArrayList;

public class WarmUp {
    public static void main(String[] args) {

        // list [1,2,3,4,5]
        // output [1,2,3,4,0]
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(list.size()-1);
        list.add(0);
        System.out.println(list);



        // write programm can multiply each ODD num by 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        System.out.println(list2);
        for (int i = 0; i <list2.size()-1 ; i++) {
            int each = list2.get(i); // gets each of elements inboxing
            if (each% 2 !=0){
                list2.set(i, each*2); // only for odd elemeent
            }
        }
        System.out.println(list2);


        System.out.println("===========================");

        int [] scores= {65, 75, 77, 85,82,7,95,98};

        ArrayList<Integer> Alist = new ArrayList<>();
        ArrayList<Integer> Blist = new ArrayList<>();
        ArrayList<Integer> Clist = new ArrayList<>();
        ArrayList<Integer> Dlist = new ArrayList<>();
        ArrayList<Integer> Flist = new ArrayList<>();


        for (int each: scores) {
            if (each<=90){
                Alist.add(each);
            }else  if (each >=80){
                Blist.add(each);
            }else if (each >=70){
                Clist.add(each);
            }else  if (each>=60){
                Dlist.add(each);
            }else if (each>50){
                Flist.add(each);
                System.out.println("Sorry failed");
            }
        }

        System.out.println("total num of A: "+Alist.size());
        System.out.println(" A list: "+Alist);
        System.out.println("total num of B: "+Blist.size());
        System.out.println("B list: "+Blist);
        System.out.println("total num of C: "+Clist.size());
        System.out.println(" list:  C: "+Clist);
        System.out.println("total num of D: "+Dlist.size());
        System.out.println("  list:  D: "+Dlist);
        System.out.println("total num of F: "+Flist.size());
        System.out.println("  list:  F: "+Flist);




    }
}
