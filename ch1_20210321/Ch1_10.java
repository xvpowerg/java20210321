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
public class Ch1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	/*for (int i =1;i<=5;i++){
	    if (i ==3){
		//break;
		continue;
	    }
	    System.out.println(i);
	}*/
	//o(n^2)
	tage:
	for (int i = 1;i<=5;i++){
	    System.out.println("Start :"+i);
	    for (int k =1;k<=3;k++){
		System.out.print("body:"+i+"_"+k+" ");
		if (i==3){
		    break tage;
		    //continue;
		}
	    System.out.print("body End=====:");	
	    }
	     System.out.println();	
	    System.out.println("End :"+i);	    
	}
	
	//Strat:1
	//B:1_1 B:1_2 //B:1_3
	//End:1
	//Strat:2
	//B:2_1 B:2_2 //B:2_3
	//End:2
    }
    
}
