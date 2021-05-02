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
public class MyException1 extends Exception{
    public MyException1(){
	this("MyException1");
    }
    public MyException1(String s){
	super(s);
    }
}
