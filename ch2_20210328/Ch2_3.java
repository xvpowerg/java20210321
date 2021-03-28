/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_3 {

    public static void main(String[] args) {
	//陣列的預設值
	//整數 0
	//浮點數 0.0
	//字元 空白字元
	//布林 false
	//參考型態 null
	int[] array1 = new int[1000];	    
	Arrays.fill(array1, -1);
	System.out.println(array1[85]);
	String[] array2 = new String[50];
	//Arrays.fill(array2, "");
	switch(array2[5]){
	    case "Ken":
		System.out.println("V1");
		break;
	   case "Vivin":
		System.out.println("V2");
		break;	
	   case " ":
		System.out.println("Empty");
		break;		
	   default:
	       System.out.println("Default");
	       break;
	}
	
    }
    
}
