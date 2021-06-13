/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_1_stream1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList();
        list.add("Vivin");
        list.add("Lucy");
        list.add("Ken");
        list.add("Iris");
        list.add("Tom");
       //預設情況下 使用ArrayList 回傳的是List

       List<String> list2 = list.stream().
                filter(n->n.length() > 3).collect(Collectors.toList());
        System.out.println(list2);
        //回傳TreeSet
         //也可以呼叫 toCollection 自訂要回傳的Collection
       LinkedList list3 =   list.stream().filter(n->n.length() > 3).
                 collect(Collectors.toCollection(LinkedList::new));
       TreeSet set4 =   list.stream().filter(n->n.length() > 3).
                 collect(Collectors.toCollection(TreeSet::new));
          System.out.println(set4);
    }
    
}
