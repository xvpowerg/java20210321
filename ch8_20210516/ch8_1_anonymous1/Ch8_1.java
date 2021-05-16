/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_1_anonymous1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    private static class Dog2 extends Dog{
	public void bark(){
	    System.out.println("喵喵");	    
	}
    }
    public static void main(String[] args) {
	
	Dog dog1 = new Dog();
	dog1.bark();
	Dog dog2 = new Dog2();
	dog2.bark();//輸出喵喵!!
	//匿名內部類
	//1 先new 物件
	//2 加上{}
	//3 {}內加上覆寫方法
	Dog dog3 = new Dog(){
	    public void bark(){
		System.out.println("哞~");		
	    }
	};
	dog3.bark();
    }
    
}

