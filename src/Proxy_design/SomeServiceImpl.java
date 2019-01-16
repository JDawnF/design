package Proxy_design;

/**
 * @program: design
 * @description:
 * @author: baichen
 * @create: 2018-08-27 20:46
 **/
public class SomeServiceImpl implements SomeService {
    @Override
    public String doFirst() {
        System.out.println("执行doFirst()方法");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("执行doSecond()方法");
    }
}
