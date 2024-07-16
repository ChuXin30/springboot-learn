package org.designPatterns.c25_Visitor;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:36
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
