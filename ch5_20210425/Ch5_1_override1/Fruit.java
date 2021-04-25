/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_1_override1;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    public Fruit(String name,int price){
	this.name = name;
	this.price = price;
    }
    public void print(){
	System.out.println(this.name+":"+this.getPrice());	
    }
    
    public int getPrice(){
	return price;
    }
    
    
}
