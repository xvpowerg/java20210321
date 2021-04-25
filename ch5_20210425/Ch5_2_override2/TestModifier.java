/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_2_override2;

/**
 *
 * @author xvpow
 */
public class TestModifier {
    public String publicStr = "publicStr";
    protected String  protectedStr = "protectedStr";
    String defaultStr = "defaultStr";
    private String privateStr = "privateStr";
    
    public void test(){
	System.out.println(privateStr);
	
    }
    
}
