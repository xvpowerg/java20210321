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
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//左邊[]數量加種等於右邊的[]
	int[][] arra2x3 = new int[2][3];//推薦
	int[] arra2x2[] = new int[2][2];
	int arra3x2[][] = new int[3][2];
	//宣告時用
	int[][] arrax1 = {{1,2,3},{5,6}   };
	//任何情況下可用 重新賦予數值
	int[][]arrayx2 = new int[][]{
	    {5,6},{2,3,4}
	};
	
	
	int[][] arrayx3 = new int[3][];
	
	int[] a1 = new int[5];
	arrayx3[0] = new int[5];
	arrayx3[1] = new int[2];
	arrayx3[2] = new int[3];
	
	arrayx3[0][2] = 85;
	arrayx3[1][1] = 23;
	
	for(int[] a : arrayx3){
	    for (int v : a){
		System.out.print(v+" ");
	    }
	    System.out.println();
	}
	
    }
    
}
