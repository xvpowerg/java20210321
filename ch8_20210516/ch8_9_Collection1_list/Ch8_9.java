/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_9_Collection1_list;
import java.util.ArrayList;
import java.util.List;
public class Ch8_9 {
    static void testList(List<String> list){
	System.out.println();
	list.forEach((v)->System.out.print(v+" "));
	System.out.println();
    }
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lucy");
	list.add("Iris");
//        list.forEach(System.out::println);
	testList(list);
	System.out.println(list.get(1));
	//插入
	list.add(2, "Tom");
	testList(list);
	List<String> tmpList = new ArrayList<>();
	tmpList.add("Joy");
	tmpList.add("Ben");
	tmpList.add("Gigi");
	//合併
	list.addAll(tmpList);	
	testList(list);
	//移除
	list.remove("Tom");
	testList(list);
	//有條件式的移除
	list.removeIf(v->v.indexOf("s") !=-1);
	testList(list);
	//可修改陣列
	list.replaceAll(n->{
	    String result = n;		    
		if (n.length() < 4){
		   result = "Title:"+n; 
		}
	return result;
	});
	testList(list);
    }
    
}
