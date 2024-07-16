package org.designPatterns.c25_Visitor;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:38
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
