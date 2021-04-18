/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_1_constructor1;

/**
 *
 * @author xvpow
 */
public class Animal {
    
    //Constructor 建構式
    //1 方法名稱跟類別一樣
    //2 沒有回傳值
    //預設建構式
    public Animal(){ }
    
    public Animal(String name,int age,float height){	
	this.name = name;
	this.setAge(age);
	this.setHeight(height);
    }
    
    private String name;
    private int age;
    private float height;    
    public void setName(String name){
	//this. 用途
	//1 指定呼叫目前物件的內容
	//2 快速呼叫函數
	this.name = name;
    }
    public String  getName(){
	return name;
    }    
    public void setAge(int age){
	this.age = age;
    }    
    public int getAge(){
	return age;
    }
    public void setHeight(float height){
	this.height = height;
    }
    public float getHeight(){
	return height;
    }    
    public void print(){
	System.out.println(getName()+":"+getAge()+":"+getHeight());
    }    
}
