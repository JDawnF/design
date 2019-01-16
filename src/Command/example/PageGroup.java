package Command.example;

/**
 * @program: design
 * @description: 美工组
 * @author: baichen
 * @create: 2018-12-26 17:21
 **/
public class PageGroup extends Group {
    //客户要求页面组过去和他们谈
    public void find() {
        System.out.println("找到美工组...");
    }

    //客户要求增加一项页面
    public void add() {
        System.out.println("客户要求增加一项页面...");
    }

    //客户要求修改一项页面
    public void change() {
        System.out.println("客户要求修改一项页面...");
    }

    //客户要求删除一项页面
    public void delete() {
        System.out.println("客户要求删除一项页面...");
    }

    //客户要求给出变更计划
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
