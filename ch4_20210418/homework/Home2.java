/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.homework;

/**
 *
 * @author xvpow
 */
public class Home2 {

 	//練習
    /*使用一組陣列A 存放 5組學生物件

    學生物件內有屬性
    姓名 
    班級 
    5筆成績
    方法:
    相對應 姓名 班級 的set 與 get
    appendScore 新增成績
    超過5筆會產生錯誤
    print
    可顯示 姓名 班級 與所有成績
	
    呼叫陣列A的所有學生的 print 方法	
	*/

    public static void main(String[] args) {
	// TODO code application logic here
	    Student[] sts = new Student[5];
	    
	    Student st1 = new Student();
	    st1.setName("Ken");
	    st1.setClassName("Class1");
	    st1.appendScore(58);
	    st1.appendScore(79);
	    st1.print();
	      Student st2 = new Student("Iris","Class2",80,75,24);
	      Student st3 = new Student("Lucy","Class3",61,82,37);
	      Student st4 = new Student("Tom","Class4",73,95);
	      Student st5 = new Student("Bom","Class5",80,25,24,96,77);
	      
	     sts[0] = st1;
	     sts[1] = st2;
	     sts[2] = st3;
	     sts[3] = st4;
	     sts[4] = st5;
	     
	     for (Student s : sts){
		 s.print();
	     }
    }
    
}
