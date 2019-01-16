package Command;

/**
 * @program: design
 * @description: 调用者
 * @author: baichen
 * @create: 2018-12-26 17:46
 **/
public class Invoker {
    private Command command;
    //受气包，接受命令
    public void setCommand(Command _command){this.command =_command;}
    //执行命令
    public void action(){this.command.execute();}
}
