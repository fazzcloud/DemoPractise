package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:56
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//定义子类：乌龟，继承宠物类
public class Tortoise extends Animal{
    private int number;
    private int price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override//实现抽象方法（本宠物总价计算：单价 * 数量）
    public int calcPrice() {
        int sumPrice = this.number * this.price;
        return sumPrice;
    }
}
