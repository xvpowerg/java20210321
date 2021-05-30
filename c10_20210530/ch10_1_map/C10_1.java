/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_1_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Comparator;

/**
 *
 * @author xvpow
 */
public class C10_1 {

    /**
     * @param args the command line arguments
     */
    static Comparator<Item> cmp;
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
        cmp= Comparator.comparing(Item::getPrice);
        cmp = cmp.thenComparing(Item::getName);
	HashMap<Integer,TreeSet<Item>> groupMap = new HashMap();
         //群組化後的Item可依照price排序 如果price依樣用name
         //依照Item金額做群組
        
//         for(Item it : list){
//            int price = it.getPrice();
//            int key = price /100;
//            
//            groupMap.computeIfPresent(key, (k,ov)->{
//            ov.add(it);
//            return ov;
//            });
//            groupMap.computeIfAbsent(key, (k)->{
//                TreeSet<Item> set = new TreeSet<>(cmp);
//                set.add(it);
//                return set;
//            });
//        }

   for(Item it : list){
            int price = it.getPrice();
            int key = price /100;
            TreeSet<Item> defSet = new TreeSet<>(cmp);
            defSet.add(it);
            groupMap.merge(key, defSet, (ov,nv)->{
                ov.addAll(nv);
                return ov;
            });
   }
         System.out.println(groupMap);
	//groupMap.computeIfAbsent(Integer.SIZE, mappingFunction)
	//groupMap.computeIfPresent(Integer.SIZE, remappingFunction)   
        
        
        
    }
    
}
