package demo_mediator;

import lombok.Data;

/**
 * 同时类 , 调用中介者
 */
@Data
public abstract class AbstractColleague {
    private AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
