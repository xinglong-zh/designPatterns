package demo_chainHandler;

public class SonChain extends Handler {

    public SonChain(){
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {

        System.out.println("请求是"+women.getRequest());
        System.out.println("儿子的答复是:同意");

    }
}
