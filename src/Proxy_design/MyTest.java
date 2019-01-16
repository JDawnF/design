package Proxy_design;

/**
 * @program: design
 * @description: 测试类
 * @author: baichen
 * @create: 2018-08-27 20:48
 **/
public class MyTest {
    public static void main(String[] args) {
        SomeService someService = new SomeServiceProxy();
        String result = someService.doFirst();
        System.out.println("result=" + result);
        someService.doSecond();
    }
}
