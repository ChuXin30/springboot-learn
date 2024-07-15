package org.designPatterns.c20_Observer;

/**
 * @author Chen Hao
 * @date 2024/7/15 23:46
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
