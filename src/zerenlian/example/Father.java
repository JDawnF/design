package zerenlian.example;

/**
 * @program: design
 * @description:
 * @author: baichen
 * @create: 2019-01-11 16:28
 **/
public class Father extends Handler {
    //未出嫁的女儿来请示父亲
    /*@Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }*/
    //父亲只处理女儿的请求
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    //父亲的答复
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
