package demo_observer;

import lombok.Data;

/**
 * 被观察者
 */
@Data
public class HanFeiZi implements IHanFeiZi {
    /**  是否在吃饭  */
    private boolean isHavingBreakfast = false;
    /**  是否在娱乐  */
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("在吃饭");
        this.isHavingBreakfast = true;

    }

    @Override
    public void haveFun() {
        System.out.println("在娱乐");
        this.isHavingFun = true;

    }
}
