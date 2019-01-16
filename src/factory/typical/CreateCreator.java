package factory.typical;

/**
 * @program: design
 * @description: 具体工厂类，定义产生什么样的产品对象
 * @author: baichen
 * @create: 2018-12-01 10:45
 **/
public class CreateCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
