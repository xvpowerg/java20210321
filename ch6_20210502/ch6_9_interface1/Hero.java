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
public class Hero implements HuntHeroGroup{
    public void flying(){
	System.out.println("Hero fly");
    }
    public void hunting(){
	System.out.println("Hero Hunt");
    }
    public void runing(){
	System.out.println("Hero Run!");
    }
}
