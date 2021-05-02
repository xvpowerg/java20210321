/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_1_exception_overrild;

/**
 *
 * @author xvpow
 */
public class MyRuntimeException1  extends RuntimeException{
	public MyRuntimeException1(){
	    this("MyRuntimeException1");
	}
	
	public MyRuntimeException1(String str){
	    super(str);
	}
}
