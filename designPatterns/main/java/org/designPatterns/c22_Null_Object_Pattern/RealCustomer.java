package org.designPatterns.c22_Null_Object_Pattern;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:09
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
