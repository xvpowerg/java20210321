/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210321;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    public static void main(String[] args) {
	//Switch case
	
	//參數可傳入的類型byte short int char String enum
	final int RUN = 1,JUMP=2,WALK=3;
	
	int action = RUN;
	switch(action){
	    default:
               System.out.println("錯誤");
		break;
	    case RUN:
		System.out.println("跑");
		break;
	    case JUMP:
               System.out.println("跳");
	       	break;
	    case WALK:
		System.out.println("走");
		break;	    	
	}
	
	byte b1 = 10;
	switch(b1){
	    case 'A':
		break;
	    case '1':
		break;
	}
	
	
    }
    
}
