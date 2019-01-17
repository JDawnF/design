package Strategy.example;

/**
 * @program: design
 * @description: 其中一个策略
 * @author: baichen
 * @create: 2019-01-17 16:57
 **/
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
