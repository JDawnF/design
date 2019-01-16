package yuanxing.copy;

/**
 * @program: design
 * @description: 测试类
 * @author: baichen
 * @create: 2018-12-25 11:21
 **/
public class Client {
    public static void main(String[] args) {
        Thing thing=new Thing();
        thing.setValue("张三");
        Thing cloneThing=thing.clone();
        cloneThing.setValue("李四");
        //输出张三和李四，因为clone是copy对象，所以其实李四并没有被copy
        System.out.println(thing.getValue());
        System.out.println(cloneThing.getValue());
    }
}
