/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_5_override4;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    
    Person(String name,int age){
	this.name = name;
	this.age = age;
    }
    public String getName(){
	return name;
    }    
    public int getAge(){
	return age;
    }
    
    public void print(){
	System.out.println(getName()+":"+getAge());
    }
}
