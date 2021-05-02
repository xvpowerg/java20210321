/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_5_initblock_order;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//順序 static nostatic contructor
	//次數 static 只執行一次 nostatic 與 contructor new幾次運行幾次
	TestOrder to1 = new TestOrder();	
	TestOrder to2 = new TestOrder();
	
    }
    
}
