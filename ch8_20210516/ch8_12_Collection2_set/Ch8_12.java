/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_12_Collection2_set;
import java.util.HashSet;
public class Ch8_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//set 不可重複
	//HashSet無序
	//不可用index取得set
	HashSet<String> set = new HashSet<>();
	
	set.add("Ken");
	set.add("Lucy");
	set.add("Iris");
	set.add("Ken");
	set.forEach(System.out::println);
	
    }
    
}
