/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_1_interface1;

/**
 *
 * @author xvpow
 */
public class TestData  implements ShowMsgIF{
    private String data;
    TestData(String data){
	this.data = data;
    }
       public String msg(){
	   return this.data ;
       }
}
