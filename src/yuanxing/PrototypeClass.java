package yuanxing;

/**
 * @program: design
 * @description: 原型类，实现了Cloneable接口
 * @author: baichen
 * @create: 2018-12-25 10:31
 **/
public class PrototypeClass implements Cloneable {
    //重写Object的clone方法
    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass=null;
        try {
            prototypeClass=(PrototypeClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
