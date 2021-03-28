/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;

import java.util.List;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int[][] array3x2 = new int[3][2];
	array3x2[0][1] = 71;
	array3x2[1][0] = 52;
	array3x2[2][1] = 96;	
	for (int i= 0;i < array3x2.length;i++){
	    for (int k = 0; k < array3x2[i].length;k++){
		System.out.print(array3x2[i][k]+" ");
	    }
	    System.out.println();
	}
	//For each
	
	for (int[] arr : array3x2 ){
	    for (int v : arr){
		System.out.print(v+" ");
	    }
	    System.out.println();
	}
	
	
    }
    
}
