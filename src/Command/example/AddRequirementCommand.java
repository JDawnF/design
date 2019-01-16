package Command.example;

/**
 * @program: design
 * @description: 增加需求的命令
 * @author: baichen
 * @create: 2018-12-26 17:24
 **/
public class AddRequirementCommand extends Command {
    //执行增加一项需求的命令
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
