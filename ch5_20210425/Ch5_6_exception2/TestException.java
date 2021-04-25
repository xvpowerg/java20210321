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
public class TestException {
    public void testChecked(boolean ex)
	    throws IOException{
	
	if (ex){
	    throw new IOException();
	}	
    }
    public void testunChecked(boolean ex){
	    
	if (ex){
	    throw new  IllegalArgumentException("錯誤的參數");
	}
    }
    
}
