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
public class Ch3_13 {
    
    public static void main(String[] args) {
	//類別 樣板
	//物件 依樣板生產的物品
	
	//宣告一個變數 可以存放 Kettle 物件
	 Kettle k1 ;
	 //new Kettle(); 創造一個java的Kettle 物件
	 k1 = new Kettle();//放到k1變數內
	 k1.capacity = 100;
	 k1.color = "紅";
	 k1.material = "304";
	 k1.price = 500;
	
	
	Kettle k2 = new Kettle();
	k2.capacity = 250;
	k2.color = "黑";
	k2.material = "315";
	k2.price = 600;
	k1.print();
	k2.print();
    }
    
}
