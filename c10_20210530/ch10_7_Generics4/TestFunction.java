/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_7_Generics4;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class TestFunction {
    
    public <R> R testValue(R v){
        return v;
    }
    
    public <R> R calculate(R v1,R v2,
            BinaryOperator<R> bio){    
        return bio.apply(v1, v2);
    }
    
    public static <T,E extends Exception> 
        void testEmpty(T v,
                Predicate<T> isEmpty,
                Supplier<E>ex)throws E{            
            if (isEmpty.test(v)){
                throw ex.get();
            }
    }
    
    
    
}
