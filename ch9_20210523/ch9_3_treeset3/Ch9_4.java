/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_3_treeset3;
import java.util.TreeSet;
import java.util.Comparator;
import tw.ocm.order.Order;
/**
 *
 * @author xvpow
 */
public class Ch9_4 {
//排序器
    private static class MyOrderComparator implements Comparator<Order>{
	//o1 大於 o2 回傳正數
	//o1 小於 o2 回傳負數
	//o1 等於 o2 回傳0
    public int compare(Order o1,Order o2){
	if (o1.getTotal() > o2.getTotal()){
	    return 1;
	}else if (o1.getTotal() < o2.getTotal()){
	    return -1;
	}
	return o1.getUser().compareTo(o2.getUser());
    }
}
    public static void main(String[] args) {
	Order order1 = new Order("Ken",6500);
	Order order2 = new Order("Vivin",6500);
	Order order3 = new Order("Lindy",3200);
	Order order4 = new Order("Irirs",9500);
	Order order5 = new Order("Ken",150);
	Order order6 = new Order("Lucy",2100);
	MyOrderComparator moc = new MyOrderComparator();
	TreeSet<Order> treeSet = new TreeSet<>(moc);
	treeSet.add(order1);
	treeSet.add(order2);
	treeSet.add(order3);
	treeSet.add(order4);
	treeSet.add(order5);
	treeSet.add(order6);
	
	treeSet.forEach(v->System.out.print(v+" "));

    }
    
}
