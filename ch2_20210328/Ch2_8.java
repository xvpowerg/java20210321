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
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[][] array = new int[3][];
	//array[0] = new int[6];
	//array[1] = new int[3];
	array[2] = new int[3];
	//array[0][5] = 10;//java.lang.ArrayIndexOutOfBoundsException
	//array[1][2] = 4;//java.lang.NullPointerException
	array[2][0] = 8;
	
	for (int[] a : array){
	    for (int v : a){
		System.out.print(v+" ");
	    }
	    System.out.println();
	}
	
    }
    
}
