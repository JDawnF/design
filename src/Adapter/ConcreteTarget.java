package Adapter;

/**
 * @program: design
 * @description: 目标角色的实现类
 * @author: baichen
 * @create: 2019-01-18 17:27
 **/
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
