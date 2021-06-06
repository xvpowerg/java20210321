/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_11_stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch11_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Iris");
       myList.add("Tom");
       List<String> nameList 
               = myList.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
System.out.println(nameList );
//Collectors.toCollection 指定要轉換的集合
TreeSet<String> treeSet = myList.stream().map(n->n.toUpperCase()).
        collect(Collectors.toCollection(TreeSet::new));
System.out.println(treeSet);
//Key重複會出錯
//  Map<Integer,String> map1 = myList.stream().collect(Collectors.toMap(n->n.length()//key
//          , n->n//value
//  ));
//   System.out.println(map1);

TreeMap<Integer,String> map2 =  myList.stream().collect(Collectors.toMap(n->n.length(), 
        n->n, (v1,v2)->{
            System.out.println(v1+":"+v2);
    return v1+","+v2;
    },TreeMap::new));
System.out.println(map2);
    }
    
}
