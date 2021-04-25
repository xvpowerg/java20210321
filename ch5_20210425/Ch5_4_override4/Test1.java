/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_4_override4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int func1(){
	System.out.println("Test1 Func1");
	return 0;
    }
    
    public Test1 func2(){
	System.out.println("Test1 func2");
	return new Test1();
    }
}
