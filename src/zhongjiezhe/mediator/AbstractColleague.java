package zhongjiezhe.mediator;

/**
 * @program: design
 * @description: 抽象同事类
 * @author: baichen
 * @create: 2018-12-25 14:57
 **/
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
