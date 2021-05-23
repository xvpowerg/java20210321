/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_3_treeset3;
import tw.ocm.order.Order;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    private static class MyOrder extends Order implements Comparable<Order>{
	    MyOrder(String name,int total){
		super(name,total);
	    }
	   public int compareTo(Order order){
	       if (this.getTotal() > order.getTotal()){
		   return 1;
	       }else if(this.getTotal() < order.getTotal()){
		   return -1;
	       }
	       return this.getUser().compareTo(order.getUser());
	   } 
	    
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	Order order1 = new MyOrder("Ken",6500);
	Order order2 = new MyOrder("Vivin",6500);
	Order order3 = new MyOrder("Lindy",3200);
	Order order4 = new MyOrder("Irirs",9500);
	Order order5 = new MyOrder("Ken",150);
	Order order6 = new MyOrder("Lucy",2100);
	TreeSet<Order> treeSet = new TreeSet<>();
	treeSet.add(order1);
	treeSet.add(order2);
	treeSet.add(order3);
	treeSet.add(order4);
	treeSet.add(order5);
	treeSet.add(order6);
	
	treeSet.forEach(v->System.out.print(v+" "));
	
    }
    
}

