package org.designPatterns.c19_Memento;

/**
 * @author Chen Hao
 * @date 2024/7/15 23:37
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
