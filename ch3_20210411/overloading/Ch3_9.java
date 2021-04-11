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
public class Ch3_9 {
      /*
    一模一樣類型
    相同類型可相容
       什麼較相同類型?
         假設我有一個short類型 ,int ,long
    不同類型可相容        
    封箱類型    
    */
    //參數一個以上 必須有100確定 不可都模糊
    static void test6(int a,float b){
	System.out.println("int float");
    }
    static void test6(float c,short b){
	System.out.println("float short");
    }
    
    static void test7(Integer a,int b){
	System.out.println("Integer int");
    }
    //因為參數的數值是基本形態 所以 最佳選擇類型是基本形態
    static void test7(float a,int b){
		System.out.println("float int");
    } 
    
    static void test8(float f,int v1){
	System.out.println("float int");
    }
    static void test8(int v2,float f1){
	System.out.println("int float");
    }
    
    public static void main(String[] args) {
	test6(10,20);	
	//short s1 =75;
	//test6(10,s1);//因為兩參數都可符合test6 沒有最合適的 所以錯誤
	test7(15,17);
	
	test8(10,20f);
    }
    
}
