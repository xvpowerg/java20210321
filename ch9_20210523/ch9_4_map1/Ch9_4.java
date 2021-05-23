/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_4_map1;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    public static void main(String[] args) {
	
	HashMap<String,Integer> map = new HashMap();
	map.put("Ken",100);
	map.put("Vivin",25);
	map.put("Iris",60);
	map.put("Ken",96);
	//System.out.println(map.get("Ken"));
	
	//java8之前
	Set<String> keySet = map.keySet();
	for (String k : keySet){
	    System.out.println(map.get(k));
	}
	
	Set<Entry<String,Integer>> entrySet =   map.entrySet();
	for (Entry<String,Integer> e : entrySet){
	    System.out.println(e.getKey()+":"+e.getValue());
	}
	System.out.println("===================");
	//java8
	map.forEach((k,v)->System.out.println(k+":"+v));
	
	
    }
    
}
