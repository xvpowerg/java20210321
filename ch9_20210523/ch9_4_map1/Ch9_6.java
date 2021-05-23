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
public class Ch9_6 {

    public static void main(String[] args) {
	//請找出 相同數字的所有key 
	//A 30
	//B 50
        //C 50
	//D 16
	//E 20
	//F 50
	//G 16
	 HashMap<String,Integer> map1 = new HashMap<>();
	 HashMap<Integer,String> resultMap = new HashMap<>();
	 map1.put("A", 30);
	 map1.put("B", 50);
	 map1.put("C", 50);
	 map1.put("D", 16);
	 map1.put("E", 20);
	 map1.put("F", 50);
	 map1.put("G", 16);
	 
	 map1.forEach((k,v)->{
	     String str = k+" ";
		if (resultMap.containsKey(v)){
		    str+=resultMap.get(v);
		}
	     resultMap.put(v, str);
	 });
	 
	 System.out.println(resultMap);
	 
	 //3 8 9 7 1	 
	 //計算數列當中配對能為10的數字 
	
    }
    
}

