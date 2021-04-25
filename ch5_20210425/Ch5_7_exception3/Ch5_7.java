/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_7_exception3;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	TestException tex = new TestException();
	try{
	tex.testMyEx(true);
	}catch(MyException ex){
	    System.out.println(ex);
	}
    }
    
}
