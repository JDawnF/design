package zerenlian.example;

/**
 * @program: design
 * @description:
 * @author: baichen
 * @create: 2019-01-11 16:28
 **/
public class Son extends Handler {
    /*//母亲向儿子请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是:同意");
    }*/
    //儿子只处理母亲的请求
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    //儿子的答复
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
