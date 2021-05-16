/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_1_anonymous1;

/**
 *
 * @author xvpow
 */
public abstract class Person {
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
    public abstract int getSalary();
}
