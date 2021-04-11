/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210411.oo;

/**
 *
 * @author xvpow
 */
public class Ch3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//封裝 Encapsulation
	//1將屬性變為私有
	//2宣告公開方法控制私有屬性
	
	//name 幫我封裝
	//限制條件 
	//1 長度必須大於1 小於50
	//2 不可為null
	Student st1 = new Student();
	//st1.name = "Ken";
	st1.setName(null);
	//年齡限制 5 ~ 200
	//st1.age = 25;
	st1.setAge(210);
	st1.print();		
    }
    
}
