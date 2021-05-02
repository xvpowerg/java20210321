/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_2_comm_overrild_method;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    public static void main(String[] args) {
	Student st1 = new Student("Ken",95);
	//st1.print();
	System.out.println(st1);
//	System.out.println(Student.class.getName());
//	System.out.println("@");
//	System.out.println(Integer.toHexString(st1.hashCode()));

	Student st2 = new Student("Ken",95);
	System.out.println(st2);
	String str = "Vivin";
	System.out.println(st1.equals(null));
	System.out.println(st1.equals(str));
	System.out.println(st1.equals(st2));
	
    }
    
}
