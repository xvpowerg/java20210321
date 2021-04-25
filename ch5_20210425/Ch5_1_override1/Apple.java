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
public class Apple extends Fruit{
    //希望 這個類別的name預設為Apple
    //金額可設定
    public Apple(int price){
	super("Apple",price);
    }
    public int getPrice(){
	//super. 呼叫父類別的getPrice
	return super.getPrice() + 50;
    }
}
