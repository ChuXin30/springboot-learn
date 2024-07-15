package org.designPatterns.c19_Memento;

/**
 * @author Chen Hao
 * @date 2024/7/15 23:38
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
