package demo_observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 被观察者
 * 实现被观察者所有的方法
 */
@Data
public class HanFeiZi extends Observable implements IHanFeiZi {
    /**  是否在吃饭  */
    private boolean isHavingBreakfast = false;
    /**  是否在娱乐  */
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("在吃饭");
        this.isHavingBreakfast = true;
        super.setChanged();
        super.notifyObservers("在吃饭");

    }
    @Override
    public void haveFun() {
        System.out.println("在娱乐");
        this.isHavingFun = true;
        super.setChanged();
        super.notifyObservers("在娱乐");
    }

}
