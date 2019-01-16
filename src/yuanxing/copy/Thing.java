package yuanxing.copy;

import java.util.ArrayList;

/**
 * @program: design
 * @description: 浅拷贝
 * @author: baichen
 * @create: 2018-12-25 11:20
 **/
public class Thing implements Cloneable {
    private ArrayList<String> arrayList=new ArrayList<String>();
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing=(Thing)super.clone();
            //加上这个后，也会copy非对象了
            thing.arrayList=(ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }
}
