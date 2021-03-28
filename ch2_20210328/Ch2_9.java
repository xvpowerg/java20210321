/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;



public class Ch2_9 {
    //void 表示無回傳
    //test名稱
    //()可傳參數
    static void test(){
	 System.out.println("Hello!!");
	}
    static int test2(int a,int b){
	int ans = a * b;
	return ans;
    }
    //max 可以傳入陣列
    //假設陣列的所有數值都是正數
    //在不使用排序的情況下 找到最大值
    //陣列長度 不可為0 且不可為 null 如果不符合條件回傳-1
    //找到陣列最大值就回傳
    static int max(int[] array){
	if ( array==null || array.length == 0   ){
	    return -1;
	}
	int max = array[0];
	for (int i = 1;i < array.length;i++){
		if (array[i] > max){
		    max = array[i];
		}
	}
	return max;
    }
//static 只能接呼叫static
    public static void main(String[] args) {
	// TODO code application logic here
	//test();
	System.out.println(test2(2,3));
	
	int[] array = {8,1,3,9,11,2};
	System.out.println(max(array));
    }
    
}
