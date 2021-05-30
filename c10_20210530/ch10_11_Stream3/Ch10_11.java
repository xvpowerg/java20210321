/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_11_Stream3;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.function.IntSupplier;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch10_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //解紹Stream有哪一些
        /*
        Stream 物件用
        IntStream LongStream DoubleStream  基本型態用
        */
      //產生Stream
         IntStream st = IntStream.of(5,8,1,6);         
        System.out.println("sum:"+st.sum());
        Random random = new Random();
        IntStream intStream =  IntStream.generate(()->random.nextInt(10000));
        //limit 限制3次
        intStream.limit(3).forEach(v->System.out.println(v));
        IntStream.iterate(1, v->v+1).limit(10).forEach(i->System.out.println(i));
        System.out.println("======================");
        //rangeClosed(5,20)5~20
        //range(5,20)5~19
        IntStream.rangeClosed(5, 20).forEach(v->System.out.println(v));
    }
    
}
