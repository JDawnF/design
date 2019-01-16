package factory.typical;

/**
 * @program: design
 * @description: 测试工厂模式
 * @author: baichen
 * @create: 2018-12-01 10:49
 **/
public class Test {
    public static void main(String[] args) {
        Creator creator = new CreateCreator();
        Product product = creator.createProduct(CreateProduct1.class);
//        继续业务
    }
}
