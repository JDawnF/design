package Command;

/**
 * @program: design
 * @description: 测试场景类
 * @author: baichen
 * @create: 2018-12-26 17:47
 **/
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReciver1();
        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
