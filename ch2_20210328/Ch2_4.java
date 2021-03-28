/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;

import java.util.Arrays;

public class Ch2_4 {
    public static void main(String[] args) {
	int[] a = {11,12,13,14,15,16,17,18,19};	
	int[] newA = Arrays.copyOf(a, 5);
	for (int v : newA){
	    System.out.print(v+" ");
	}
	System.out.println();
	//(2,7] 以index來說
	// copyOfRange 第一個傳 index開始位置 第二個傳 copy的長度 結束位置
	int[] newA2 =Arrays.copyOfRange(a, 2, 7);
	for (int v : newA2){
	    System.out.print(v+" ");
	}
	System.out.println();
	
	int[] array2 = {81,9,25,5,7,3,26};
	//預設由小到大的遞增排序
	Arrays.sort(array2);
	for (int v : array2){
	    System.out.print(v+" ");
	}
	System.out.println();
	for (int i=array2.length-1 ;i >=0;i--){
	    System.out.print(array2[i]+" ");
	}
	
	//Arrays.binarySearch(args, args)
    }
    
}
