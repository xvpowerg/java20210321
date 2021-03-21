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
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int v = 8 ;
	//x >> n  表示 x 除與　2^n
	//8 >> 1  8 / pow(2,1) 
	System.out.println(v >> 1);
	 //x << n  表示 x 乘　2^n
	 //8  << 1  8 * pow(2,1)
	System.out.println(v << 1);	
	
	int n1 = 0b101101;//45

	int n2 = 0b110110;//54
	int n3 = 0b011011;
//----------------------------------------]
	//&        100100
	//|        111111
	//^        011011	
	System.out.println(n1 & n2);//交用來過濾
	System.out.println(n1 | n2);//融合
	System.out.println(n1 ^ n2);//加密
	System.out.println(n2 ^ n3);//解密
	
    }
    
}
