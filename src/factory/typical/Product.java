package factory.typical;

/**
 * @program: design
 * @description: 抽象产品类Product负责定义产品的共性，实现对事物最抽象的定义,具体产生什么样的产品由具体的产品定义
 * @author: baichen
 * @create: 2018-12-01 10:39
 **/
public abstract class Product {
    //产品类的公共方法
    public void method1(){}
    //抽象方法
    public abstract void method2();
}
