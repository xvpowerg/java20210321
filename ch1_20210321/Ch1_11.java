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
public class Ch1_11 {

    public static void main(String[] args) {
//陣列是參考型態	
	int[] values = new int[5];
	values[0] = 85;//index*array類型的byte大小 + values位置
	values[1] = 70;
	values[3] = 56;
	System.out.println(values[1]);
	int idx = 3;
	System.out.println(values[idx]);
	values[idx]++;
	System.out.println(values[idx]);
	values[idx] = 12;
	System.out.println(values[idx]);
	System.out.println(values[2]);
	
//	String st1="";
//	String st2="";
//	for (int i= 0; i < 5;i++){
//	    st1+=" "+i+" ";
//	    st2+=values[i]+" ";	   
//	}
//System.out.println(st1);
//System.out.println(st2);

	for (int i= 0; i < 5;i++){
	    System.out.printf("values[%d]=%d%n",i,values[i]);
	}
	    
	int A= 2;
	int B =2;
	A++;
	++B;
	System.out.println(A);
	System.out.println(B);

    }
    
}
