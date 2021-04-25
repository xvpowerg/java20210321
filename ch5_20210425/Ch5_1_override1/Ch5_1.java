/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_1_override1;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Fruit f1 = new Fruit("Apple",10);
	f1.print();
	
	f1 = new Apple(20);
	f1.print();
	
	
	Fruit f2 = new Apple(20);//50
	System.out.println(f2.getPrice());
	
	Fruit b1 = new Banana(30);//+60
	System.out.println(b1.getPrice());
	Fruit f3 = new Fruit("Cherry",60);
	System.out.println(f3.getPrice());

    }
    
}
