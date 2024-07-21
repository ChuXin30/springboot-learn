package org.designPatterns.c31_Intercepting_Filter;

/**
 * @author Chen Hao
 * @date 2024/7/21 22:58
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
