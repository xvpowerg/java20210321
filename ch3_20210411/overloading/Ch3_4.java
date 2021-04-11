/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210411.overloading;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {
    //Overloading 多載
    //依照 函數名稱 與 參數類型 數量 確定呼叫的方法
    
    static int sum(int v,int n){
	 return v + n; 
    }
    
    static float sum(float v,float n ){
	return v + n;
    }
   //模擬預設值
    static float sum(float v){
	return sum(v,10);
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	int v1 = sum(10,20);
	System.out.println(v1);	
	float f1 = sum(25.1f,75.2f);	
	System.out.println(f1);
	float f2 = sum(5);
	System.out.println(f2);
	
    }
    
}
