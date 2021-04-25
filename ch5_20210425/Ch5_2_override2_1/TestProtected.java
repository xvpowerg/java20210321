/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_2_override2_1;
import ch5_20210425.Ch5_2_override2.TestModifier;
/**
 *
 * @author xvpow
 */
public class TestProtected extends TestModifier {
    public void test(){
	System.out.println(this.protectedStr);
    }
}
