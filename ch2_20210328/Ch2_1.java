/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210328;
import java.util.stream.IntStream;
public class Ch2_1 {
    public static void main(String[] args) {
	int[] array  = new int[5];
	array[0] = 25;//100	
	array[2] = 10;//108
	array[4] = 93;//108
	
//	for(int i =0;i < array.length;i++){
//	    System.out.print(array[i]+" ");
//	}
//      for (int i =0;i <array.length ;i++){
//	  int v = array[i];	
//	 System.out.print(v+" ");  
//      }
	//for each 輪巡
//	for (int v : array){
//	    System.out.print(v+" ");
//	}
	
	IntStream.of(array).forEach(v->System.out.print(v+" "));
    }
    
}
