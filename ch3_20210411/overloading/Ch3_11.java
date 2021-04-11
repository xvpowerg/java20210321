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
public class Ch3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//10 轉 2進位
	String  sb1 = Integer.toBinaryString(126);
	//10 轉 8進位
	String  oct = Integer.toOctalString(127);
	//10 轉 16進位
	String hex = Integer.toHexString(127);
	System.out.println(sb1);
	System.out.println(oct);
	System.out.println(hex);
	
    }
    
}
