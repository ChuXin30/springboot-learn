package org.designPatterns.c31_Intercepting_Filter;

/**
 * @author Chen Hao
 * @date 2024/7/21 22:58
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
