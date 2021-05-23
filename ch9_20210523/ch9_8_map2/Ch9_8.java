/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_8_map2;
import java.util.HashMap;
public class Ch9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<>();
	map.put("A", 30);
	map.put("B", 20);
	map.put("C", 50);
	map.put("D", 16);
	//compute key 存在與否都會執行function 
	map.compute("B", (k1,v1)->{
		    System.out.println("Compute:"+k1+":"+v1);
		    //回傳值 會寫入map
		    return v1+70;
	});
	System.out.println(map);
	
	map.compute("ZZ", (k1,v1)->{
	    System.out.println("Compute Not key:"+k1+":"+v1);
	    	    //回傳值 會寫入map
	    return 20;
	});
	System.out.println(map);
	//key不存在
	map.computeIfAbsent("XX", k->{
		System.out.println("IfAbsent:"+k);
	    return 350;});
       System.out.println(map);
       map.computeIfAbsent("XX", k->{
	   System.out.println("key Exist IfAbsent:"+k);
	   return -100;
       });
             System.out.println(map);
	//
	 map.computeIfPresent("A", (k,v)->{
	     System.out.println("computeIfPresent:"+k+":"+v);
	     return v + 100;
	 });
	System.out.println(map);
    }
    
}

