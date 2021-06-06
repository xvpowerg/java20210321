/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_1_stream1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xvpow
 */
public class Ch11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lindy");
       myList.add("joy");
       myList.add("Lucy");
       myList.add("Lindy");
       myList.add("Lucy");
       //注意count回傳long
       long count = myList.stream().count();
       System.out.println(count);
       //distinct 過濾重複
       myList.stream().distinct().forEach(s->System.out.println(s));
       System.out.println("=========filter==============");
       myList.stream().distinct().filter(n->n.length() > 3).forEach(n->System.out.println(n));       
       System.out.println("===========limit============");
       myList.stream().limit(3).forEach(v->System.out.println(v));
       System.out.println("===========skip============");
       //跳過前2各
       myList.stream().skip(2).forEach(v->System.out.println(v));
       
    }
    
}
