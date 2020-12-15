package demo_chainHandler;

public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("请求是"+ women.getRequest());
        System.out.println("丈夫答复是:同意");
    }
}
