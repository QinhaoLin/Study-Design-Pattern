package com.观察者模式;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
