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
public class Ch3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//字串轉整數
	String s = "123";
	int v = Integer.parseInt(s);
	System.out.println(v+2);
	String s2 = " 123 ";
	//移除前後空白 trim()
	int v2 = Integer.parseInt(s2.trim());
	System.out.println("======================");
	//超過 Integer大小 也會拋出java.lang.NumberFormatException
	String s3 =Integer.MAX_VALUE+""+1;
	System.out.println(s3);
	Integer.parseInt(s3);
	
    }
    
}
