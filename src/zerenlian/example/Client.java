package zerenlian.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: design
 * @description: 场景测试类
 * @author: baichen
 * @create: 2019-01-11 16:30
 **/
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
//     nextInt(int bound)返回伪随机的，均匀分布 int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        /*IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();*/
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        /*for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            } else {
                //暂时什么也不做}
            }
        }*/
        //设置请示顺序，一步步往下传
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }
}
