package demo_chainHandler;

public class FatherChain extends Handler {

    public FatherChain(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("请求是"+women.getRequest());
        System.out.println("父亲的答复:同意");
    }
}
