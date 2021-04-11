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
public class Kettle {
    int capacity;
    String color;
    String material;
    int price;
    
    void print(){
	System.out.println(color+":"+material+":"+capacity+":"+price);
    }
}
