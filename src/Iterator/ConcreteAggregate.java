package Iterator;

import java.util.Vector;

/**
 * @program: design
 * @description: 具体容器
 * @author: baichen
 * @create: 2019-01-18 18:04
 **/
public class ConcreteAggregate implements Aggregate {
    //容纳对象的容器
    private Vector vector = new Vector();
    //增加一个元素
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }
    //删除一个元素
    @Override
    public void remove(Object object) {
        this.remove(object);
    }
    //返回迭代器对象
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
