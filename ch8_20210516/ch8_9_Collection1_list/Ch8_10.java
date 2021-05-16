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
public class Ch8_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	//會自動封箱
	list.add(10);
	list.add(20);
	list.add(25);
	int v = list.get(2);
	System.out.println(v);
	//list.remove(20);
	list.remove(Integer.valueOf(20));
	System.out.println(list);
	
	
    }
    
}
