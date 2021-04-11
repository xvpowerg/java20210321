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
public class Ch3_6 {
    //沒小數點的
    //byte short int long
    //有小數點的
    //float double
    
       /*
    一模一樣類型
    相同類型可相容
       什麼較相同類型?
         假設我有一個short類型 ,int ,long
    不同類型可相容        
    封箱類型    
    */
   // 不同類型可相容
    static void test2(float f1){
	System.out.println("float f1");
    }
    static void test2(byte b1){
	System.out.println("byte b1");
    }
    
       // 相同類型可相容
    static void test3(float f1){
	System.out.println("test3 float f1");
    }
    static void test3(long v1){
	System.out.println("test3 long v1");
    }
    static void test3(byte b1){
	System.out.println("test3 byte b1");
    }
    public static void main(String[] args) {
	
	test2(2); //因為2 是 int  但是test2沒有int類型 也沒有long 所以往不同類型可相容 
		//float 可以相容
	test3(10);//因為10 是 int 但是test3 沒有int類型的參數 所以往long
	       
    }
    
}
