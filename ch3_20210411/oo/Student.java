/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210411.oo;

/**
 *
 * @author xvpow
 */
public class Student {
    //私有只能在類別內存取
    private String name;
    private int  age;
    public void setName(String inName){
	if (inName == null || inName.length() < 2 || inName.length() > 50 ){
	    System.out.println("錯誤的姓名");
	    return;
	}
	name= inName;
    }
    public String getName(){
	return name;
    }
    
    public void setAge(int inAge){	
	if (inAge < 5 || inAge >200){
	    System.out.println("錯誤的年齡！");
	    return;//結束函數
	}
	age = inAge;
    }
    
    public int getAge(){
	return age;
    }
    void print(){
	System.out.println(name+":"+getAge());
    }
}
