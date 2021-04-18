/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_2_extends1;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {
    //繼承
    //不能被繼承的
    //看不到的 ?? private 或 default在不同套件時
    //建構式
    public static void main(String[] args){
	Dog dog = new Dog();
	dog.setName("Google");
	dog.setAge(10);
	dog.setHeight(25.6f);
	dog.print();
	Dog dog2 = new Dog("Yahoo",5,18.62f);
	dog2.print();
	
	Dog dog3 = new Dog();
	dog3.print();
	
	Dog dog4 = new Dog("Sky");
	dog4.print();
    }
}

