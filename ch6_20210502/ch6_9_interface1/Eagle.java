/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_9_interface1;

/**
 *
 * @author xvpow
 */
public class Eagle implements Fly,Hunt {
    
    public void flying(){
	System.out.println("老鷹飛!!");
    }
    public void hunting(){
	System.out.println("老鷹抓小雞!!");
    }
}
