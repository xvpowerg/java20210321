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
public class Test2 extends Test1{
    //回傳如是基本形態必須一樣
    @Override
    public int func1(){
	System.out.println("Test2 func1");
	return 10;
    }
    //  如是參考形態可以是子類
    @Override
    public Test2 func2(){
	System.out.println("Test2 func2");
	return new Test2();
    }
}
