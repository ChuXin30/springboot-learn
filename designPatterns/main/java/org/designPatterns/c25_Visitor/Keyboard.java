package org.designPatterns.c25_Visitor;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:36
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
