/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_9_interface1;

/**
 *
 * @author xvpow
 */
public class Ch6_9 {

    /**
     * @param args the command line arguments
     */
    static void testFly(Fly fly){
	fly.flying();
    }
    static void testHunt(Hunt hunt){
	hunt.hunting();
    }
    public static void main(String[] args) {
	// TODO code application logic here
	//介面一般方法只能是抽象的
	Eagle e1 = new Eagle();
	testFly(e1);
	testHunt(e1);
	Hero hero = new Hero();
	testFly(hero);
    }
    
    
}
