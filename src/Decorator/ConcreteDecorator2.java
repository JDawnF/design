package Decorator;

/**
 * @program: design
 * @description: 具体的装饰类
 * @author: baichen
 * @create: 2019-01-17 16:23
 **/
public class ConcreteDecorator2 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    //定义自己的修饰方法
    private void method2() {
        System.out.println("method2 修饰");
    }

    //重写父类的Operation方法
    public void operate() {
        this.method2();
        super.operate();
    }
}

