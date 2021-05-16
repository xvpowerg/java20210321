/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_7_MethodRef1;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch18_8 {

    
    public static void main(String[] args) {
	    Tools tool = new Tools();
	    tool.setTitle("Tool");
	Consumer<String>c1 = tool::foreach;
	c1.accept("Gigi");
	//會呼叫預設建構式
	Supplier <Tools> supp = Tools::new;
	System.out.println(supp.get());
	//將字串放入建構式作為預設值
	Function<String,Tools> toolFunc = Tools::new;
	System.out.println(toolFunc.apply("ToolsFunc"));
    }
    
}
