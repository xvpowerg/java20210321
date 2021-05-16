/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_12_Collection2_set;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch8_14 {
    public static void main(String[] args) {
	//排序 由小到大的遞增排序
	TreeSet<Integer> treeSet = new TreeSet();
	treeSet.add(10);
	treeSet.add(5);
	treeSet.add(1);
	treeSet.add(9);
	treeSet.add(3);
	treeSet.add(4);
	treeSet.add(5);	
	treeSet.forEach(v->System.out.print(v+" "));
	
    }
    
}

