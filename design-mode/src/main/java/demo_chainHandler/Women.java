package demo_chainHandler;

public class Women implements IWomen {

    private int type = 0;
    private String request;

    /**
     * 通过构造函数 传递请求
     *
     * @param type
     * @param request
     */
    public Women(int type, String request) {
        this.type = type;
//        this.request = request;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是" + request;
                break;
            case 2:
                this.request = "妻子的请求是" + request;
                break;
            case 3:
                this.request = "母亲的请求是" + request;
                break;
        }
    }

    /**
     * 通过 int 类型来判断状态
     * 1 - 未出嫁
     * 2 - 出嫁
     * 3 - 夫死
     *
     * @return 返回个人状态类型
     */
    @Override
    public int getType() {
        return this.type;
    }

    /**
     * @return
     */

    @Override
    public String getRequest() {
        return this.request;
    }
}
