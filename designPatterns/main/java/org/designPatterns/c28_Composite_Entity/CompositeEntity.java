package org.designPatterns.c28_Composite_Entity;

/**
 * @author Chen Hao
 * @date 2024/7/17 23:10
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
