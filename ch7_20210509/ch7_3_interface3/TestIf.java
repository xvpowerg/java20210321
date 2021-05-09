/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_3_interface3;

/**
 *
 * @author xvpow
 */
public interface TestIf {
    void testX();
    public static boolean testNumber(String value){	    
	if (value == null) return false;	
	char[] c =  value.toCharArray();
	for (char tmpc : c){
	    if (tmpc < '0' ||  tmpc > '9'){
			return false;	
	    }	    
	}
	return true;
    }
}
