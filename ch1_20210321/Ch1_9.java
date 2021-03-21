/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210321;

/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    
    static int test1(){
	System.out.println("Test1!");
	return 1;
    }
    static boolean test2(int count){
	System.out.println("Test2:"+count);
	return true;
    }
    static void test3(int count){
	  System.out.println("Test3:"+count);
    }
    
    public static void main(String[] args) {
	// 1 2 3
	// 4 2 3
	int i,k =1;
	for (i = test1();i <=3&&test2(k);i++,test3(++k)){
	    System.out.println(i+"_"+k);
	}
	System.out.println(i);
	System.out.println(k);
	
	//Test1!
	//Test2:1
	//1+"_"+1
	//Test3:2
	//Test2:2
	//2_2
	//Test3:3
	//Test2:3
	//3_3
	//Test3:4
	// 4
	// 4
	
    }
    
}

