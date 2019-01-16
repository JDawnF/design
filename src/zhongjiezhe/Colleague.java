package zhongjiezhe;

/**
 * @program: design
 * @description: 抽象同事类
 * @author: baichen
 * @create: 2018-12-25 16:07
 **/
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
