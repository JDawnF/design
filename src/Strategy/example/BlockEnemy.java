package Strategy.example;

import Strategy.example.IStrategy;

/**
 * @program: design
 * @description: 其中一个策略
 * @author: baichen
 * @create: 2019-01-17 16:57
 **/
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
