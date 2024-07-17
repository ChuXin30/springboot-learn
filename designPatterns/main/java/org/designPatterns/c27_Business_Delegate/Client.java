package org.designPatterns.c27_Business_Delegate;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:01
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
