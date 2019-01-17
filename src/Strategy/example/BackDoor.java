package Strategy.example;

/**
 * @program: design
 * @description: 其中一个策略
 * @author: baichen
 * @create: 2019-01-17 16:57
 **/
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
