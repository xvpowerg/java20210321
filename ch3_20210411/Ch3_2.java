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
public class Ch3_2 {

    /**
     * 封箱類型
     */
    public static void main(String[] args) {
	// 基本形態轉物件類型
	// 基本形態   封箱類型
	// byte       Byte
	// short      Short
	// int        Integer
	// long       Long
	// float      Float
	// double     Double
	// char      Character
	// boolean   Boolean
	//都會消耗效能
	//如何手動封箱   基本-->物件
	int v1 = 25;
	Integer v2 = Integer.valueOf(v1);		
	//如何手動開箱  
	int v3 = v2.intValue();
	System.out.println(v3);
	//自動封箱
	//因為25是整數 所以自動封箱為Integer
	Integer v4 = 25;
	//Float f1 = 10;//會錯 因為10會轉成Integer Float不相容Integer
	//自動開箱
	int v5 = v4;
	
    }
    
}
