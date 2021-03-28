/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[] array2 = {81,9,25,5,7,3,26};
	Arrays.sort(array2);
	//3 5 7 9 25 26 81
	int index = Arrays.binarySearch(array2, 25);
	System.out.println(index);
	//找不到 一律是負數
	//1 比所都小 回傳-1
	 int index2 =  Arrays.binarySearch(array2, 1);
	 System.out.println(index2);
	//2 比所都大
	int index3 = Arrays.binarySearch(array2, 100);//(長度+1) *-1
	System.out.println(index3);
	//3 介於中間
	int n = 6;
	int index4 = Arrays.binarySearch(array2, n);//(比n大一點的長度) *-1
	System.out.println(index4);
	index4 = Arrays.binarySearch(array2, 16);
	System.out.println(index4);
    }
    
}
