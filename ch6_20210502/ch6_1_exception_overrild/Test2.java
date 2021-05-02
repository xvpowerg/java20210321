/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_1_exception_overrild;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    //覆寫可拋出子類 或一樣 或不拋出  以上條件只針對 覆寫時為"必要例外檢測(catchd)"類型的才有用
    //throws MyException1 throws MyException2  不拋出  
    @Override
     public void testException()throws MyException2{
	
    }
     
     //覆寫可拋出子類 或一樣 或不拋出 
    //throws MyRuntimeException1 throws MyRuntimeException2  不拋出  
     public void testRuntimeException()throws NullPointerException{
	
    }
}
