/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_5_override4;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {

    /**
     * @param args the command line arguments
     */
    
    static Person getPerson(int type){
	if (type == 1){
	    return new Employee("E T1",26);
	}else{
	    return new Teacher("TE T2",37);
	}
    }
    public static void main(String[] args) {
	Person p1 = new Person("Ken",25);
	p1.print();
	//低耦合
	//多型(polymorphism)
	 Person p2 = getPerson(2);
	 p2.print();
	
    }
    
}
