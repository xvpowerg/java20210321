/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_8_abstract2;

/**
 *
 * @author xvpow
 */
public abstract class SqlClass {
    private String[] query(){
	String[] data = {"Ken","Vivin","Lindy","Join"};
	return data;
    }
    
    //我在寫SqlClass 不知道如何寫 
    //等報表開發人員做
    protected abstract void exportStyle(String[] data);
    public void export(){
	String[] data = query();
	exportStyle(data);
    }
}
