package org.designPatterns.c02_Abstract_Factory;


public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}