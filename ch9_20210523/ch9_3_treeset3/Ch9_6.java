/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_3_treeset3;

import java.util.TreeSet;
import tw.ocm.order.Order;
import java.util.Comparator;

/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//order type 
	//1  金額排 姓名排	
	//2  姓名排 金額排
	
	int orderType = 1;
	
	Comparator<Order> cmp = Comparator.comparing(od->od.getTotal());
	cmp = cmp.thenComparing(od->od.getUser());
	if (orderType == 2){
	    cmp = Comparator.comparing(od->od.getUser());
	    cmp = cmp.thenComparing(od->od.getTotal());
	}
	Order order1 = new Order("Ken",6500);
	Order order2 = new Order("Vivin",6500);
	Order order3 = new Order("Lindy",3200);
	Order order4 = new Order("Irirs",9500);
	Order order5 = new Order("Ken",150);
	Order order6 = new Order("Lucy",2100);
	
       TreeSet<Order> treeSet = new TreeSet<>(cmp);
	treeSet.add(order1);
	treeSet.add(order2);
	treeSet.add(order3);
	treeSet.add(order4);
	treeSet.add(order5);
	treeSet.add(order6);
	treeSet.forEach(v->System.out.print(v+" "));
    }
    
}
