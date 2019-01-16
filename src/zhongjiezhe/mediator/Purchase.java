package zhongjiezhe.mediator;

/**
 * @program: design
 * @description:采购管理
 * @author: baichen
 * @create: 2018-12-25 14:23
 **/
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}

