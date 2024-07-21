package org.designPatterns.c32_Service_Locator;

/**
 * @author Chen Hao
 * @date 2024/7/21 23:10
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
