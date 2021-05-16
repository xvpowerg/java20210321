/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_12_Collection2_set;

import ch8_20210516.ch8_9_Collection1_list.*;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String value;
    
    public Item(int id,String value){
	this.id = id;
	this.value = value;
    }
    
    public String toString(){
	return id+":"+value;
    }
    
    public boolean equals(Object obj){
	if (obj == null || obj instanceof Item == false){
	    return false;
	}
	Item tmp = (Item) obj;	
	return this.id == tmp.id && 
		this.value.equals(tmp.value);	
    }
    
    //若hashCode不相等則equals一定不相等
    //先判定 hashCode是否一樣
    //如果hashCode相同在比equals
    public int hashCode(){
	return this.id+this.value.hashCode();
    }
  
}
