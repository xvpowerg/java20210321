/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {
	
    static void test1(int s,int e){	
	System.out.println(s);	
	if (s == e){return;}
	test1(s+1,e);	
    }
    
   static void test2(int s,int e){		
	if (s == e){return;}
	test2(s+1,e);
	System.out.println(s);		
    }
    
   
   static void tree(int n){
       if(n <=0) return;
       System.out.println(n);
       tree(n-1);
       tree(n-1);
   }
    public static void main(String[] args) {
	// TODO code application logic here
//	for (int i =1;i<=500000;i++){
//	    System.out.println(i);
//	}
	//test2(1,5);
	
	tree(3);
    }
    
}
