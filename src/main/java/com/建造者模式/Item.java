package com.建造者模式;

/**
 * 食品条目
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
