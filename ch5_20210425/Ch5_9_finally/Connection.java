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
public class Connection {
    private String ip;
    public void connet(String ip){
	this.ip = ip;
    }
    public void close(){
	this.ip ="" ;		
    }
    public void print(){
	System.out.println(ip);
    }
}
