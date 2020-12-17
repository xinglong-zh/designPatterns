package demo_facade;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("收件地址" + address);

    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("放进信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件");

    }
}
