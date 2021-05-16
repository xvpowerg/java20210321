/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_12_Collection2_set;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch8_13 {
    public static void main(String[] args) {
	Item item1 =new Item(10,"Item1");
	Item item2 =new Item(20,"Item2");
	Item item3 =new Item(30,"Item3");
	Item item4 =new Item(10,"Item1");
	HashSet<Item> set = new HashSet();
	set.add(item1);
	set.add(item2);
	set.add(item3);
	set.add(item4);
	set.forEach(it->System.out.println(it));
	
    }
    
}
