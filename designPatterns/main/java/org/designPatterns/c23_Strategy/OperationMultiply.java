package org.designPatterns.c23_Strategy;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:21
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
