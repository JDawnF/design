package zhongjiezhe;

/**
 * @program: design
 * @description: 通用中介者
 * @author: baichen
 * @create: 2018-12-25 16:06
 **/
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}

