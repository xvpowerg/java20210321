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
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[] array1 = new int[3];//java 推薦
	int array2[] = new int[3];
	//{}只能在宣告時使用
	int[] array3 = {5,6,1,2,3};
	//任何時機點都可使用 //非宣告情況下 想更換Array的數值
	int[] array4 = new int[]{7,8,9};
	
	// 1 幫我輪巡　array3:
	    for (int v : array3){
		System.out.print(v+" ");		
	    }
	    System.out.println();		
	// 2 加總 array4 內的數字:
	    int total = 0;
	    for (int a : array4){
		total += a;    
	    }
	System.out.print(total+" ");		
    }
    
}
