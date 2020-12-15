package demo_chainHandler;

public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("请求是"+ women.getRequest());
        System.out.println("儿子答复是:同意");
    }
}
