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
public class ReportClass extends SqlClass {
    public void exportStyle(String[] data){
	for (String d : data){
	    System.out.println("Title:"+d);
	}
    }
}
