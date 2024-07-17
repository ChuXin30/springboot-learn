package org.designPatterns.c27_Business_Delegate;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:00
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
