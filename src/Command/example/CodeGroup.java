package Command.example;

/**
 * @program: design
 * @description: 功能组
 * @author: baichen
 * @create: 2018-12-26 17:21
 **/
public class CodeGroup extends Group {
    //客户要求功能组过去和他们谈
    public void find() {
        System.out.println("找到功能组...");
    }

    //客户要求增加一项功能
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    //客户要求修改一项功能
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    //客户要求删除一项功能
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    //客户要求给出变更计划
    public void plan() {
        System.out.println("客户要求功能变更计划...");
    }
}
