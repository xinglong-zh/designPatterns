package demo_facade;

/**
 * 写信的四个过程 ,
 */
public interface ILetterProcess {
    /**
     * 填写内容
     * @param context
     */
    void writeContext(String context);

    /**
     * 填写地址
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * 放进信封
     */
    void letterIntoEnvelope();

    /**
     * 发送信件
     */
    void sendLetter();
}
