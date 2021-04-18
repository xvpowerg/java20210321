/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.homework;

/**
 *
 * @author xvpow
 */
public class Student {
    final int SCORE_COUNT =5;
    private String name;
    private String className;    
    private int[] scores = new int[SCORE_COUNT];
    private  int i= 0;    
    
    public Student(){}
    public Student(String name,
	    String className,
	    int ...score){
	this.setName(name);
	this.setClassName(className);
	for (int s :score){
	   if (this.appendScore(s)==false) break;
	}
    }
    public void setName(String name){
	this.name = name;
    }
    public String getName(){
	return name;
    }
    
    public void setClassName(String className){
	this.className = className;
    }
    public String getClassName(){
	return className;
    }
    public boolean appendScore(int score){	
	if (i >= SCORE_COUNT){
	    System.out.println(this.getName()+":新增錯誤的分數");
	    return false;
	}
	this.scores[i++] = score;		
	return true;
    }
    public void print(){
	String scStr= "";
	for (int k = 0;k < i;k++){
	    scStr = scStr + scores[k]+" ";
	}
	System.out.printf("姓名:%s 班級:%s 分數:%s%n",
	this.getName(),this.getClassName(),scStr);
    }
    
}
