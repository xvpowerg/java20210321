/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_2_treeset2;

/**
 *
 * @author xvpow
 */
public class Item  implements Comparable<Item>{
    private String name;
    private int code;
    private int price;  
    public Item(String name,int code,int price){
	this.name = name;
	this.code = code;
	this.price = price;
    }
    public String toString(){
	return name+":"+code+":"+price;
    }
    
    // 如果目前大於 傳入的 回傳大於0的正數
    // 如果目前小於 傳入的 回傳負數數
    // 如果目前等於 傳入的 回傳0
    public int compareTo(Item item){
	//比金額
	//區域
	//品名
	if (this.price > item.price){
	    return 1;
	}else if (this.price < item.price){
	    return -1;
	}else if(this.code > item.code){
	    return 1;
	}else if(this.code < item.code){
	    return -1;
	}	
	//一定是等於
	return this.name.compareTo(item.name);
    }
    
}
