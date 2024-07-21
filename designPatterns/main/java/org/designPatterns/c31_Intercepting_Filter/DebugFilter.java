package org.designPatterns.c31_Intercepting_Filter;

/**
 * @author Chen Hao
 * @date 2024/7/21 22:57
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
