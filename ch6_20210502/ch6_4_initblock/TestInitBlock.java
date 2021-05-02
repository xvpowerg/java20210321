/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_4_initblock;

/**
 *
 * @author xvpow
 */
import java.util.Arrays;
public class TestInitBlock {
    //幫我把data初始值變為空白字串
private String[] data = new String[50000];    
    //所有建構式都需要初始化的內容
    //可放在非靜態初始化區塊
    {
	for (int i = 0;i < data.length;i++){
	    data[i] = "";		    
	}    
    
     }

    public TestInitBlock(){

    }
    public TestInitBlock(String s){
    }
    public TestInitBlock(String s,int v2){
    }
    public String getData(int i){
	return data[i];
    }
}
