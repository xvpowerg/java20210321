/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.homework;

/**
 *
 * @author xvpow
 */
public class Home1 {



//    static int testMax(int[] array,int left,int right){
//	int max = 0;
//	if (left == right){
//	    return array[left];
//	}
//	int mid = (left + right) >>1 ;
//	int v1 = testMax(array,left,mid);
//	int v2 =  testMax(array,mid+1,right);
//	max = v1 > v2 ?v1:v2;
//	return max;
//    }

    static int min(int ... v){
	if (v == null || v.length == 0){
	    return -1;
	}
	if (v.length == 1){
	    return v[0];
	}
	int min = v[0];
	for (int x : v){
	    if (min > x){
		min = x;
	    }
	}
	return min;
    }
    static String min(String... s ){
	String min = s[0];
	for (String v : s){
	    if (min.length() > v.length()){
		min = v;
	    }
	}
	return min;
    }
    public static void main(String[] args) {
	// 練習
	//寫一個min 方法 參數不可傳相同的數字 請找出最小值
	//ex : min(98,7,3,5,1,10,15);
	int m1 = min(98,7,3,5,1,10,15);
	System.out.println(m1);
	//min:1
	//寫一個min 方法 參數不可傳相同的字串 請找出長度最小的字串
	//ex : min("AAAAA","BBBB","QQ");
	String m2 = min("AAAAA","BBBB","QQ");
	System.out.println(m2);
	//min:QQ
	
	
//	int [] array = {8,2,5,1,7,9};
//	int max =  testMax(array,0,array.length-1);
//	System.out.println(max);
    }
    
}
