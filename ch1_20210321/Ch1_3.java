/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210321;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	boolean b1 = false;
	boolean b2 = true;
	
	System.out.println(b1 && b2);
	System.out.println(b1 || b2);
	//互斥
	System.out.println(b1 ^ b2); // 一真一假為真
	System.out.println(!b1); // 一真一假為真
	//短路
	//&&短路 結果為false 
	int g = 0;
	boolean b3 = g > 1 && ++g <10;
	System.out.println(b3);
	System.out.println(g);
	//||短路發生 結果為true 
	int k =0; 
	boolean b4 = k < 1 || ++k >3;
	System.out.println(k);
	System.out.println(b4);
	
	
    }
    
}
