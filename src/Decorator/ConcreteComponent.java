package Decorator;

/**
 * @program: design
 * @description: 具体构件
 * @author: baichen
 * @create: 2019-01-17 16:21
 **/
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public void operate() {
        System.out.println("继承抽象构件，实现具体方法");
    }
}
