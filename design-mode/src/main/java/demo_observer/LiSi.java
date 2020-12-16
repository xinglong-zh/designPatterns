package demo_observer;

/**
 * 观察者
 */
public class LiSi implements ILISi {
    @Override
    public void update(String context) {
        System.out.println("李斯开始汇报");
        this.reportToBoss(context);
        System.out.println("汇报完毕");
    }

    private void reportToBoss(String reportContext){
        System.out.println("李斯:汇报活动"+reportContext);
    }
}
