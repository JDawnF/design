package Command;

/**
 * @program: design
 * @description: 抽象命令者
 * @author: baichen
 * @create: 2018-12-26 17:44
 **/
public abstract class Command {
//    //定义一个子类的全局共享变量
//    protected final Receiver receiver;
//
//    //实现类必须定义一个接收者
//    public Command(Receiver _receiver) {
//        this.receiver = _receiver;
//    }

    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
