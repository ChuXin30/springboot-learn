package org.designPatterns.c30_Front_Controller;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:25
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}