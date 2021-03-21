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
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int n = 10;
	// if 或 else只有一個控制的命令可以不加{}
	if (n % 2 == 0)
	    System.out.println("偶數");
	else
	    System.out.println("奇數");	
	//不在if else控制內
	    System.out.println("測試!!");	   
//因為x宣告在{}所以 生命週期 只存在於{}	
//	if(n!=3){
//	    int x = 10;
//	    x++;
//	}    
//	System.out.println(x);
	int a = 5;	
	if (a <2) 
	    System.out.println("普通");
	else if(a <5) 
	    System.out.println("正常");
	else if(a <10) 
	    System.out.println("過高");
	else 
	    System.out.println("其他!");
    }    
}
