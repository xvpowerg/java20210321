/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_4_Generics;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    public static void main(String[] args) {
        
        MyList list = new MyList();
        list.add("Ken");
        list.add("Vivin");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        MyList<Integer> list2 = new MyList();
        list2.add(25);
        list2.add(10);
        list2.add(36);        
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
    }
    
}

