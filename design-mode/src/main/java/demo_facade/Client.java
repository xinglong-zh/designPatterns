package demo_facade;

/**
 * 门面模式 ,
 * Provide a unified interface to a set of interfaces in a subsystem.Facade defines a higher-level
 * interface that makes the subsystem easier to use.（要求一个子系统的外部与其内部的通信必须通
 * 过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。）
 *
 * 这里是 提供了统一的邮局类 , 实现了对邮寄行为的封装 , 提供一个高层次的接口
 *
 * 再简单地说，门面对象是外界访问子系统内部的唯一通道，不管子系统内部是多么杂乱
 * 无章，只要有门面对象在，就可以做到“金玉其外，败絮其中”
 */
public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("开始填写信件的内容");

        letterProcess.fillEnvelope("寄送地址:xxxxxxxxxxx");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

        System.out.println("---------------------------");

        ModernPostOffice modernPostOffice = new ModernPostOffice();
        String context ="封装后的使用的信件内容";
        String address = "封装后的邮寄地址";
        modernPostOffice.sendLetter(context,address);
    }
}
