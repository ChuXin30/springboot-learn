package org.designPatterns.c31_Intercepting_Filter;

/**
 * @author Chen Hao
 * @date 2024/7/21 22:56
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
