/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_3_static;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Test t1  = new Test();
	Test t2  = new Test();
	//非靜態屬姓 彼此獨立
	//非靜態屬於物件
	t1.setMsg("T1 Msg");
	t2.setMsg("T2 Msg");
	
	System.out.println(t1.getMsg()+":"+t2.getMsg());
	//靜態 資源共享 所以 t1的資料被t2覆蓋
	//靜態屬於類別
	t1.setValue("T1 Value");
	t2.setValue("T2 Value");
	System.out.println(t1.getValue()+":"+t2.getValue());
	
	Test.setValue("T1 Value");
	Test.setValue("T2 value");
	System.out.println(Test.getValue());
    }
    
}
