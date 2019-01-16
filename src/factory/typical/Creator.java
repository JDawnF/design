package factory.typical;

/**
 * @program: design
 * @description: 抽象创建类，即抽象工厂，负责定义产品对象的产生
 * @author: baichen
 * @create: 2018-12-01 10:42
 **/
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入类型可以自行设置
     * 通常为String,Enum,Class等，也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
