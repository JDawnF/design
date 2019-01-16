package Command.example;

/**
 * @program: design
 * @description: 负责人
 * @author: baichen
 * @create: 2018-12-26 17:26
 **/
public class Invoker {
    //什么命令
    private Command command;

    //客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action() {
        this.command.execute();
    }
}
