/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_8_abstract2;

/**
 *
 * @author xvpow
 */
public class ReportClass2 extends SqlClass {
    //"Ken","Vivin"
    //"Lindy","Join"
    public void exportStyle(String[] data){
	
	for (int i = 1;i<=data.length;i++){
	    System.out.print(data[i-1]);
	    if (i %2 == 0){
		System.out.print("\n");
	    }else{
		System.out.print(",");
	    }	    	   
	}	
	
    }
}
