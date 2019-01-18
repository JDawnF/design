package Adapter;

/**
 * @program: design
 * @description: 适配器角色
 * @author: baichen
 * @create: 2019-01-18 17:29
 **/
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}
