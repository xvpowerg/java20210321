/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_9_Collection1_list;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch8_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Item item1 =new Item(10,"Item1");
	Item item2 =new Item(20,"Item2");
	Item item3 =new Item(30,"Item3");
	Item item4 =new Item(10,"Item1");
	ArrayList<Item> list = new ArrayList<>();
	list.add(item1);
	list.add(item2);
	list.add(item3);	
	list.forEach(it->System.out.println(it));
	list.remove(item4);
	System.out.println("================");
	list.forEach(it->System.out.println(it));
	//覆寫equals
		}
}