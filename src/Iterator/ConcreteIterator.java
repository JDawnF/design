package Iterator;

import java.util.Vector;

/**
 * @program: design
 * @description: 具体迭代器
 * @author: baichen
 * @create: 2019-01-18 17:59
 **/
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }

    //返回下一个元素
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    //判断是否到达尾部
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size() ) {
            return false;
        } else {
            return true;
        }
    }

    //删除当前元素
    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
