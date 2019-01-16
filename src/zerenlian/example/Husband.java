package zerenlian.example;

/**
 * @program: design
 * @description:
 * @author: baichen
 * @create: 2019-01-11 16:28
 **/
public class Husband extends Handler {
    //未出嫁的女儿来请示父亲
    /*@Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }*/
    //丈夫只处理妻子的请求
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    //丈夫请示的答复
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意\n");
    }
}
