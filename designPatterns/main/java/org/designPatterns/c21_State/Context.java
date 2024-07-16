package org.designPatterns.c21_State;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:00
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
