package demo_chainHandler;

public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("请求是"+ women.getRequest());
        System.out.println("父亲答复是:同意");
    }
}
