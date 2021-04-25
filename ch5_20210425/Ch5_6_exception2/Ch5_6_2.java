/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_6_exception2;
import java.io.IOException;
public class Ch5_6_2 {
    public static void main(String[] args) {
	//try包圍為一次交易
	try{
	    //checked 必要例外檢測
	  TestException tex = new TestException();
	  tex.testChecked(true);
	  System.out.println("Try....");
	}catch(IOException ex){
	    System.out.println(ex);
	}
		
	
	System.out.println("Test........");
    }
    
}
