/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_9_io2;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private String name;
    private boolean throwException;
    
    public TestClose(String name,boolean throwException){
        this.name = name;
        this.throwException = throwException;
    }
      public TestClose(String name){
          this(name,false);
      }

    @Override
    public String toString() {
        return "TestClose{" + "name=" + name + '}';
    }
    
    public void close()throws Exception{
        System.out.println("close name:"+name);
        if(throwException){
            throw new Exception(name);
        }
    }
}
