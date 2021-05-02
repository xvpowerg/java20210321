/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_4_initblock;

/**
 *
 * @author xvpow
 */
public class Ch6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	
	TestInitBlock t1 = new TestInitBlock();
	System.out.println(t1.getData(1));
	
	TestInitBlock t2 = new TestInitBlock("",10);
	System.out.println(t2.getData(1));	
	//TestStaticInitBlock t3 = new TestStaticInitBlock();
	//System.out.println(t3.getData(2));
	System.out.println(TestStaticInitBlock.getData(2));
    }
    
}
