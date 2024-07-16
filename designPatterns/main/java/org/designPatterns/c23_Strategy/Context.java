package org.designPatterns.c23_Strategy;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:21
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
