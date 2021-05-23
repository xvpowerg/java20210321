/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_1_treeset;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	TreeSet<Integer> treeSet = new TreeSet<>();
	//每次add都排
	//預設為小到大
	treeSet.add(10);
	treeSet.add(5);
	treeSet.add(6);
	treeSet.add(17);
	treeSet.add(13);
	treeSet.add(3);
	//3 5 6 10 13 17
	System.out.println(treeSet.first());
	System.out.println(treeSet.last());
	int x1 = 7;
	System.out.println(treeSet.lower(x1));
	System.out.println(treeSet.floor(x1));
	int x2=5;
	System.out.println(treeSet.lower(x2));//? < x2
	System.out.println(treeSet.floor(x2));//? <=x2
	int x3=3;
	System.out.println(treeSet.lower(x3));//? < x3
	System.out.println(treeSet.floor(x3));//? <=x3
	int y1 = 7;
	System.out.println(treeSet.higher(y1));//? > y1
	System.out.println(treeSet.ceiling(y1));//? >=y1
	int y2 = 17;
	System.out.println(treeSet.higher(y2));//? > y2
	System.out.println(treeSet.ceiling(y2));//? >=y2
	
	
	
	
    }
    
}
