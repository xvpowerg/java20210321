/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_2_comm_overrild_method;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score;
    public Student(String name,int score){
	this.name = name;
	this.score = score;
    }
    public void print(){
	System.out.println(name+":"+score);
    }
public String toString(){
    return name+":"+score;
}

    public boolean equals(Object obj){
	    //obj instanceof Student 是否為Student類型 
	    //是 回傳true 否 回傳 false
	if (obj == null || obj instanceof Student == false){
	    return false;
	}
	
	    Student st2 = (Student)obj;
	    return this.score == st2.score && this.name.equals(st2.name);
    }
}
