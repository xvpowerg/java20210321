/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_7_abstract;

/**
 *
 * @author xvpow
 */
public  abstract class Animal {
    private String name;
    private int age;
    Animal(){
	
    }
    Animal(String name,int age){
	this.name = name;
	this.age = age;	
    }
    //提醒開發人員覆寫此方法
    //一各類有抽象方法 類別必須改抽象
    public abstract void bark();
    
    public String toString(){
	return name+":"+age;
    }
}
