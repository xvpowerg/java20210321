/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_1_exception_overrild;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    public static void main(String[] args) {
	    
	Test1 t1 = new Test2();
	
	try{
	    t1.testException();    
	}catch(MyException1 ex){
	    
	}
	
	
    }
    
}
