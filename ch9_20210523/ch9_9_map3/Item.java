/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210523.ch9_9_map3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
	this.name = name;
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getPrice() {
	return price;
    }

    public void setPrice(int price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "Item{" + "name=" + name + ", price=" + price + '}';
    }
    
}
