/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_3_treemap2;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item("A",100);
	Item i2 = new Item("B",300);
	Item i3 = new Item("C",120);
	Item i4 = new Item("D",160);
	Item i5 = new Item("E",320);
	Item i6 = new Item("F",550);
	Item i7 = new Item("G",520);
	Item i8 = new Item("H",100);
	Item i9 = new Item("I",620);
	Item i10 = new Item("J",310);
        Comparator<Item> cmp = (it1,it2)->{
                int cmpRresult = it1.getPrice() - it2.getPrice();
                if (cmpRresult == 0){
                    cmpRresult = it1.getName().compareTo(it2.getName());
                }
        return cmpRresult;
        };        
	ArrayList<Item> list = new ArrayList<>();
	list.add(i1);
	list.add(i2);
	list.add(i3);
	list.add(i4);
	list.add(i5);
	list.add(i6);
	list.add(i7);
	list.add(i8);
	list.add(i9);
	list.add(i10);
        
        TreeMap<Item,String> map = new TreeMap<>(cmp);
        for (Item it : list){
             map.put(it, it.getName());
        }
        System.out.println(map);
    }
    
}
