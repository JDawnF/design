package Command.example;

/**
 * @program: design
 * @description: 测试
 * @author: baichen
 * @create: 2018-12-26 17:26
 **/
public class Client {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();//接头人就是小三
        // 客户要求增加一项需求
        System.out.println("------------客户要求增加一项需求---------------");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();
        //接头人接收到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
        //定义我们的接头人
        Invoker liSi = new Invoker();//接头人就是小三
        System.out.println("------------客户要求删除一个页面---------------");
        //客户给我们下命令来
        //Command command1 = new AddRequirementCommand();
        Command command1 = new DeletePageCommand();
        //接头人接收到命令
        liSi.setCommand(command1);
        //接头人执行命令
        liSi.action();
    }
}
