/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_1_anonymous1;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    public static void main(String[] args) {
	String name = "Vivin";
	int age = 25;
	Person p1 = new Person(name,age){	
	    public int getSalary(){
		if (age >= 18 && age <= 30){
		    return 25000;
		}else if (age >= 31 && age <= 40 ){
		    return 35000;
		}
		return 0;
	    }
	};
	
	System.out.println(p1.getSalary());
	
	
    }
    
}
