package org.designPatterns.c03_Singleton;

public class Singleton04 {
    private volatile static Singleton04 singleton;
    private Singleton04 (){}
    public static Singleton04 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton04.class) {
                if (singleton == null) {
                    singleton = new Singleton04();
                }
            }
        }
        return singleton;
    }
}
