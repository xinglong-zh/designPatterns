package demo_flyweight;

/**
 *
 * fly weight  , 享元模式 , (轻量级?)
 *
 * 大量的请求 , 会导致对象不断的创建 , 内存溢出  .
 * 需要采用对象共享的方式 .
 *
 * 1 提供一个存放对象的容器 .
 * 2 提供一个访问的接口 .
 *
 * 享元模式（Flyweight Pattern）是池技术的重要实现方式，其定义如下：Use sharing to
 * support large numbers of fine-grained objects efficiently.（使用共享对象可有效地支持大量的细
 * 粒度的对象。）
 *
 * 存在线程安全问题.
 *
 *
 */
public class Client {
    public static void main(String[] args) {

        SignInfo signInfo = SignInfoFactory.getSignInfo();

        for (int i=0;i<4;i++){
            String subject = "科目"+i;
            for (int j=0;j<30;j++){
                String key = subject +"考试地点" +i;
                SignInfoFactory.getSignInfo(key);
            }
        }


    }
}
