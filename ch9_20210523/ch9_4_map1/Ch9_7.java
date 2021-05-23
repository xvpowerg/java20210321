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
public class Ch9_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	
	//3 8 9 7 1	 
	//計算數列當中配對能為10的數字 
	int[] values = {3,8,9,7,1};	              
	int n = 10;
	HashMap<Integer,Integer> map = new HashMap<>();
	for (int v : values){
	    if (map.containsKey(v)){
		System.out.println(v+":"+map.get(v));
	    }
	    map.put(n-v, v);
	}
	 
    }
    
}
