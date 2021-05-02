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
public class Ch6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	SqlClass sqlClass = new ReportClass();
	sqlClass.export();
	SqlClass sqlClass2 = new ReportClass2();
	sqlClass2.export();
	
    }
    
}
