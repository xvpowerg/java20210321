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
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	/*
	相同類型 整數
	byte -128~127
	short 
	int
	long
	*/
	/*
	浮點數
	float
	double
	*/
	/*
	字元 0~65535
	char
	邏輯
	boolean
	*/
	//計算當中有浮點數 結果會是浮點數
	/*float v1 = 10;
	int v2 = 2;
	int v3 = v1/v2;*/

	
	//運算子優先順序	
	//()
	//++ --
	//* / %
	// + -
	// 比大小
	// && 
	// ||
	
	//一元運算子
	//int i = 0;	
	//int tmp = i;
	//i = i +1;
	//return tmp;
	//System.out.println(++i);
	//System.out.println(i++);
	
	int k = 0;
	int v = k++ +2 + ++k + k--;
	//      0   +2 + 2  +  2
	System.out.println(k);
	System.out.println(v);
		
	
	
	
    }
    
}
