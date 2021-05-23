/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_9_map3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch9_9 {

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
	
	HashMap<Integer,List<Item>> groupMap = new HashMap();
	//群組化後的Item可依照price排序 如果price依樣用name
	//groupMap.computeIfAbsent(Integer.SIZE, mappingFunction)
	//groupMap.computeIfPresent(Integer.SIZE, remappingFunction)
	
	for (Item it : list){
	    int key = it.getPrice()/100;
	    List<Item> tmpList = new ArrayList();
	    if (groupMap.containsKey(key)){
		tmpList = groupMap.get(key);
	    }
	    tmpList.add(it);
	    groupMap.put(key, tmpList);
	}
	System.out.println(groupMap);
	
    }
    
}
