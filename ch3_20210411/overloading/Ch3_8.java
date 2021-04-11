/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210411.overloading;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

    
       /*
    一模一樣類型
    相同類型可相容
       什麼較相同類型?
         假設我有一個short類型 ,int ,long
    不同類型可相容        
    封箱類型    
    */
    //封箱類型
    static void test4(byte b1){
	System.out.println("byte b1");
    }
    static void test4(Integer obj){
	System.out.println("Integer obj");
    }
    
    static void test5(byte b1){
	System.out.println("byte b1");
    }
    static void test5(Float obj){
	System.out.println("Float obj");
    }
    public static void main(String[] args) {
	
	test4(10);
	//test5(2);//會找不到 會轉成Integer 而 Float不相容Integer
    }
    
}
