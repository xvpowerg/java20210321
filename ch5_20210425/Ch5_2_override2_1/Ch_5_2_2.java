/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_2_override2_1;
import ch5_20210425.Ch5_2_override2.TestModifier;
//類別跨package必須import
public class Ch_5_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	TestModifier test = new TestModifier();
	System.out.println(test.publicStr);
	
    }
    
}
