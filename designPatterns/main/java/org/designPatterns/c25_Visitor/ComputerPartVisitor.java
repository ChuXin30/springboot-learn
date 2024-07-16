package org.designPatterns.c25_Visitor;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:37
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
