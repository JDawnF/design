package Proxy_design;

/**
 * @program: design
 * @description: 代理类
 * @author: baichen
 * @create: 2018-08-27 20:50
 **/
public class SomeServiceProxy implements SomeService {
    //创建代理目标对象
    private SomeService target;

    public SomeServiceProxy() {
        target=new SomeServiceImpl();
    }

    @Override
    public String doFirst() {
//        代理类调用目标方法
        String result = target.doFirst();
//        对目标方法进行增强
        return result.toUpperCase();
    }

    @Override
    public void doSecond() {
        target.doSecond();
    }
}
