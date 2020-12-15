package demo_chainHandler;

import lombok.Data;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 处理者 , 模板方法
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level =0;
    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    public final void HandleMessage(IWomen women){
        if (women.getType()==this.level){
            this.response(women);
        }else {
            if(this.nextHandler!=null){
                this.nextHandler.HandleMessage(women);
            }else {
                // 没有后续的处理人了
                System.out.println("没有人请示了 , 按照不同意处理");
            }
        }
    }

    /**
     * 寻找责任链的下一个环节
     * @param handler
     */

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    /**
     * 回应请示
     * @param women
     */
    public abstract void response(IWomen women);
}
