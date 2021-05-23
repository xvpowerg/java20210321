/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_2_treeset2;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Item it1 = new Item("A1",1,250);
	Item it2 = new Item("A2",1,650);
	Item it3 = new Item("B1",2,100);
	Item it4 = new Item("C2",3,100);
	Item it5 = new Item("A1",1,700);
	Item it6 = new Item("B1",1,100);
	Item it7 = new Item("C3",3,300);
	TreeSet<Item> treeSet = new TreeSet<>();
	treeSet.add(it1);
	treeSet.add(it2);
	treeSet.add(it3);
	treeSet.add(it4);
	treeSet.add(it5);
	treeSet.add(it6);
	treeSet.add(it7);
	treeSet.forEach(it->System.out.print(it+ "|"));
    }
    
}

