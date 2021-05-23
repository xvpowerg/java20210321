/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_4_map1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    public static void main(String[] args) {
	HashMap <String,Integer> map = new HashMap();
	map.put("A", 30);
	map.put("B", 20);
	map.put("C", 50);
	map.put("D", 16);
	
	System.out.println(map.containsKey("C"));
	if (!map.containsKey("C")){
	    map.put("C", 87);
	}	
	System.out.println(map);
	//java8開始有的 如果Key不存在寫入
	map.putIfAbsent("C", 100);
	map.putIfAbsent("E", 300);
	System.out.println(map);
	
	System.out.println(map.get("T"));
	//java8開始有的
	System.out.println(map.getOrDefault("T",0));
	//合併
	//如果key不存在 寫入value
	map.merge("X", 950, (v1,v2)->{
	System.out.println(v1+":"+v2);
	return -10;
	});
	System.out.println(map);
	//如果key存在 寫入 BiFunction的回傳值
	map.merge("B", 60,(v1,v2)->{
	System.out.println(v1+":"+v2);
	return v1+v2;
	} );
	System.out.println(map);
	
    }
    
}
