package Strategy.example;

/**
 * @program: design
 * @description: 具体执行者
 * @author: baichen
 * @create: 2019-01-17 16:59
 **/
public class ZhaoYun {
    //赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
    public static void main(String[] args) {
        Context context;//刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        //传入对应的算法实现类
        context = new Context(new BackDoor());
        //拿到妙计
        context.operate();
        //拆开执行
        System.out.println("");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate();
        //执行了第二个锦囊
        System.out.println("");
        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
        //孙夫人退兵
        System.out.println("");
    }
}
