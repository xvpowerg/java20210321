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
public class Ch3_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String  st1 = "true";
	boolean bool = Boolean.parseBoolean(st1);
	System.out.println(bool);
	//只要是true 不分大小寫
	String  st2 = "tRUe";
	boolean bool2 = Boolean.parseBoolean(st2);
	System.out.println(bool2);
	String  st3 = "t ru e";
	//不會產生錯誤 會回傳false
	boolean bool3 = Boolean.parseBoolean(st3);
	System.out.println(bool3);
    }
    
}
