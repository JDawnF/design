package Decorator.example;

/**
 * @program: design
 * @description: 四年级成绩单
 * @author: baichen
 * @create: 2019-01-17 16:17
 **/
public class FouthGradeSchoolReport extends SchoolReport {
    //我的成绩单
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println("......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(".......");
        System.out.println(" 家长签名： ");
    }

    //家长签名
    public void sign(String name) {
        System.out.println("家长签名为：" + name);

    }
}
