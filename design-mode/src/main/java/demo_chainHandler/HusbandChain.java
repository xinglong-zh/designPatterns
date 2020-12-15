package demo_chainHandler;

public class HusbandChain extends Handler {

    public HusbandChain(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    @Override
    public void response(IWomen women) {
        System.out.println("请求是"+women.getRequest());
        System.out.println("丈夫的答复是:同意");

    }
}
