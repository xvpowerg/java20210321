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
public class Ch3_5 {
       /*
     一模一樣類型
    相同類型可相容
       什麼較相同類型?
         假設我有一個short類型 ,int ,long
    不同類型可相容        
    封箱類型    
    */
    // 一模一樣類型
       static void test1(int v1,int v2){
	System.out.println("int v1 int v2");
    }
    static void test1(int v1){
	System.out.println("int v1");
    }
    static void test1(String v2){
	System.out.println("String v2");
    }
    public static void main(String[] args) {
	
	test1(20,10);
	test1(20);
	test1("");
	
	
    }
    
}
