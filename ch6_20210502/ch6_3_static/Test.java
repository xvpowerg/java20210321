/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_3_static;

/**
 *
 * @author xvpow
 */
public class Test {
    private String msg;
    private static String  stValue;
    public void setMsg(String msg){
	this.msg = msg;
    }
    public static void setValue(String value){
	stValue = value;
    }
    
    public String getMsg(){
	return msg;
    }
    public static String getValue(){
    
    return stValue;
    }
    
}
