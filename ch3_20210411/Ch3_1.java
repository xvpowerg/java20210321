/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210411;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {
    //Varargs
    //... 長參數 只能用於方法
    // 長參數 只能用於最後一筆參數
    static int avg(int... numbers){
	int ans = 0;
	int sum = 0;
	for (int v : numbers){
	    sum += v;
	}
	ans = sum / numbers.length;
	return ans;
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	
	//int[] array = {16,10,11,12,5,8};
	int ans = avg(16,10,11,12,5,8);
	System.out.println(ans);	 
	    
    }
    
}
