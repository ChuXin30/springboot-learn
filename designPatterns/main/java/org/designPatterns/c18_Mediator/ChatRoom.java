package org.designPatterns.c18_Mediator;

/**
 * @author Chen Hao
 * @date 2024/7/14 23:09
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
