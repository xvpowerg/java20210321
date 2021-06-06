/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_3_optional;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String value = "Test!";
         Optional<String> opt1 = Optional.of(value);
         Optional<String> opt2 = Optional.ofNullable(value);
         System.out.println(opt1.get()+":"+opt2.get());
         String value2 = null;
         //Optional.of(value2);//不支持使用Null產生Optional         
         Optional<String> opt3 = Optional.ofNullable(value2);
         //System.out.println(opt3.get());//因為value2為null所以不可get
         String value3 = "Test3";
         Optional<String> opt4 =  Optional.ofNullable(value3);
         
         if (opt4.isPresent()){
             System.out.println("isPresent:"+opt4.get());
         }         
         opt4.ifPresent(v->System.out.println("ifPresent:"+v));
         
         String value4 = null;
         Optional<String> opt5 =  Optional.ofNullable(value4);
         //如果不存在回傳預設值
         String opValue = opt5.orElse("Empty");
         System.out.println(opValue);
         String opValue2 = opt5.orElseGet(()->{
           Random random = new  Random();
           return random.nextInt(50000)+"";
         });
         System.out.println(opValue2);
         //如果內容為null可拋出自訂錯誤
         opt5.orElseThrow(()->new NoSuchElementException("不可為null"));
         
    }
    
}
