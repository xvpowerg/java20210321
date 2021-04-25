/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_6_exception2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws  IOException{
	// TODO code application logic here
	//checked 必要例外檢測
	TestException tex = new TestException();
	//tex.testChecked(true);
	
	System.out.println("Test........");
	//unchecked 非必要例外檢測
	try{
	    tex.testunChecked(true);
	}catch(IllegalArgumentException ex){
	    System.out.println(ex);
	}
	
    }
    
}
