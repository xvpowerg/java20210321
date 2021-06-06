/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_7_stream2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    /**
     * @param args the command line arguments
     */
    //map
    public static void main(String[] args) {
       List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lindy");
       myList.add("joy");
       myList.add("Lucy");
       
       //轉換Stream 或改變Stream 內容  記得使用map
       myList.stream().map(n->n+":"+n.length()).forEach(ns->System.out.println(ns));
       
       
       List<Set<String>> myList2 = new ArrayList<>();
       Set<String> set1 = new HashSet<>();
       set1.add("A");
       set1.add("B");
       set1.add("C");
       set1.add("D");
       Set<String> set2 = new HashSet<>();
       set2.add("E");
       set2.add("F");
       Set<String> set3 = new HashSet<>();
       set3.add("G");
       set3.add("H");
       set3.add("I");
       myList2.add(set1);
       myList2.add(set2);
       myList2.add(set3);
       //希望輸出所有List內set的內容
      //如果Stream內是集合 可使用flatMap將它攤平(展開)(把集合的內容放在Stream內)
       //myList2.stream().forEach(mySet->mySet.stream().forEach(s->System.out.println(s)));
       myList2.stream().flatMap(mySet->mySet.stream()).
               forEach(n->System.out.println(n));
    }
    
}

