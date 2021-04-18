/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_2_extends1;

//繼承
public class Dog extends Animal{
    public Dog(){
	//this() 可呼叫 目前類別的其他建構式
	//只能是建構式的一行的第一個命令
	this("未設定",0,0);
        System.out.println("Dog()");
    }
    public Dog(String name,int age,float height){
	//super() 呼叫父類別建構式
	//super() 一定要在建構式的一行的第一個命令
	//super() 只能在constructor(建構式)呼叫
	super(name,age,height);
	/*this.setName(name);
	this.setAge(age);
	this.setHeight(height);*/
    }
    //幫我建立一組件建構式 可以傳入姓名 其他都不需要
    public Dog(String name){
	this(name,0,0);
    }

}
