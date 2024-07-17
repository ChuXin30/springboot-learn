package org.designPatterns.c27_Business_Delegate;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:00
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
