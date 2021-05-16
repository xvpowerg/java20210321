/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_7_MethodRef1;


public class Tools {
    private String title;
    public Tools(){
	this("未填寫");
    }
    public Tools(String title){
	this.title = title;
    }
    public void setTitle(String title){
	this.title = title;
    }
    public void foreach(String st){
	System.out.println(title+":"+st);
    }
    
    public String toString(){
	return title;
    }
}
