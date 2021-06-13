/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_1_stream1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

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
//      Map<Integer,String> map1 =  list.stream().
//               collect(Collectors.toMap(n->n.length(), n->n));
// System.out.println(map1);
      Map<Integer,String> map2 =
              list.stream().collect(  
                      Collectors.toMap(n->n.length(), 
                              n->n, 
                              (v1,v2)->v1+":"+v2));            
     System.out.println(map2);
     //Key
     //Value
     //Key重覆要做的事
     //確定回傳的Map類型
      TreeMap<Integer,String> map3=list.stream().collect(  
                      Collectors.toMap(n->n.length(), 
                              n->n, 
                              (v1,v2)->v1+":"+v2,
                              TreeMap::new)); 
           System.out.println(map2);
    }
    
}
