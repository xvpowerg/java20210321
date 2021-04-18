/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_1_constructor1;

public class Ch4_1 {
    public static void main(String[] args) {
	Animal a1 = new Animal();
	a1.setAge(10);
	a1.setHeight(5);
	a1.setName("Momo");
	a1.print();
	//
	Animal a2 = new Animal("BoBo",6,20);
	a2.print();
    }
    
}
