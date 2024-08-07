package org.designPatterns.c18_Mediator;

/**
 * @author Chen Hao
 * @date 2024/7/14 23:09
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
