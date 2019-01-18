package Iterator;

/**
 * @program: design
 * @description: 场景类
 * @author: baichen
 * @create: 2019-01-18 18:06
 **/
public class Client {
    public static void main(String[] args) {
        //声明出容器
        Aggregate agg = new ConcreteAggregate();
        //产生对象数据放进去
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");
        //遍历一下
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
