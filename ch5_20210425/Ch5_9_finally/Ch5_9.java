/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_9_finally;

/**
 *
 * @author xvpow
 */
public class Ch5_9 {
/*
    finally 一定會運行
    必須搭配try
    */
    static void test(boolean th){
	if (th){
	    throw new RuntimeException();
	}
    }
    static int testFinally(int x){
	
	try{
		x +=5;
	    return x;	
	}finally{
	    System.out.println(x);
	}
    } 
    
    public static void main(String[] args) {
	Connection conn = null;    
	try{
	 conn = new Connection();    
	 conn.connet("163.59.88.2");
	 conn.print();
	 test(true);
	}catch(RuntimeException ex){
	    System.out.println(ex);
	}finally{//一定會執行
	   conn.close();
	   conn.print();
	}
	
	testFinally(50);
	

	
	
	
	
    }
    
}
