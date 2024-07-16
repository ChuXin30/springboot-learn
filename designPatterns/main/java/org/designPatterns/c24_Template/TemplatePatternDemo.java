package org.designPatterns.c24_Template;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:29
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
