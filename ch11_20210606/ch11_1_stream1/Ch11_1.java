/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_1_stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Ch11_1 {
    public static void main(String[] args) {
       List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lindy");
       myList.add("joy");
       myList.add("Lucy");
       //所有條件都成立回傳true
       boolean allMatch = myList.stream().allMatch(n->n.length() > 2);
       System.out.println(allMatch);       
       //有一條件符合回傳true
       boolean anyMatch = myList.stream().anyMatch(n->n.indexOf("d") > -1);
         System.out.println(anyMatch);
         //所有條件都是false 則 noneMatch結果就是true
       boolean noneMatch = myList.stream().noneMatch(n->n.indexOf("x") >-1);
        System.out.println(noneMatch);
        //一定考
        //短路現象
        //只要一個為false就短路
        boolean allMatch2 = myList.stream().peek(n->System.out.println("allMatch:"+n)).allMatch(n->n.length() > 5);
        System.out.println(allMatch2);
        System.out.println("=========================");
        //有一條件符合回傳true
        //只要一個為true就短路
       boolean anyMatch2 = myList.stream().peek(n->System.out.println("anyMatch:"+n))
               .anyMatch(n->n.indexOf("d") > -1);
         System.out.println(anyMatch2);
  System.out.println("=========================");
        //有一條件符合回傳false
        //只要一個為true就短路
         boolean noneMatch2 = myList.stream().peek(n->System.out.println("noneMatch:"+n)).
                 noneMatch(n->n.indexOf("d") > -1);
         System.out.println( noneMatch2);
    }
    
}
