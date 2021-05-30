/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_2_treemap;
import java.util.TreeMap;
public class Ch10_2 {
    public static void main(String[] args) {
        //Key排序
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(100, "Ken");
        map.put(25, "Vivin");
        map.put(6, "Iris");
        map.put(83, "Lucy");
        map.put(35, "Lindy");
        map.forEach((k,v)->System.out.println(k+":"+v));
        
        
        
    }
}
