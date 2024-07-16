package org.designPatterns.c22_Null_Object_Pattern;

/**
 * @author Chen Hao
 * @date 2024/7/16 23:10
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
