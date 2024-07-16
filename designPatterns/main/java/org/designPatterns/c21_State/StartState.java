package org.designPatterns.c21_State;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:00
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
