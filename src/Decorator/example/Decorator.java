package Decorator.example;

/**
 * @program: design
 * @description: 抽象的修饰类
 * Decorator抽象类的目的很简单，就是要让子类来封装SchoolReport的子类，重写report方法！
 * @author: baichen
 * @create: 2019-01-17 16:07
 **/
public abstract class Decorator extends SchoolReport {
    //首先我要知道是哪个成绩单
    private SchoolReport sr;

    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    public void report() {
        this.sr.report();
    }

    //看完还是要签名的
    public void sign(String name) {
        this.sr.sign(name);
    }
}
