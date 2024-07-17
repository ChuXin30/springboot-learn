package org.designPatterns.c28_Composite_Entity;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:10
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
