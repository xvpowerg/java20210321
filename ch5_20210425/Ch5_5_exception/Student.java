/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_5_exception;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    public void setName(String name){
	this.name = name;
    }
    public void setAge(int age){
	    if (age < 5 || age > 150){
		//System.out.println("錯誤的年齡");
		//return;
		throw new RuntimeException("錯誤的年齡");
	    }
	this.age = age;
    }
    public void print(){
	System.out.println(name+":"+age);
    }
    
	    
}
