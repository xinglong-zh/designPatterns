package demo_prototype;

/**
 * 通过clone 复制一份对象 , 不通过new 关键字来创建  ,成为原型模式
 * Specify the kinds of objects to create using a prototypical instance,and create new objects by
 * copying this prototype.（用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象.）
 *
 * 原型模式在内存中二进制的拷贝 , 比new 对象 性能更好 ,在循环体大量的new 对象时 , 可以考虑
 * 不会执行构造器的方法
 */
public class Client {
    private static int MAX_COUNT =3;

    public static void main(String[] args) {
        int i=0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("tail信息");
        while (i++<MAX_COUNT){

//            mail.setAppellation(i+"先生");
//            mail.setReceiver("...@163.com");
//            sendEmail(mail);

            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(i+"先生");
            cloneMail.setReceiver("xxxx@163.com");
            sendEmail(cloneMail);
        }
    }

    public static void sendEmail(Mail mail){
        System.out.println(mail.getSubject()+mail.getReceiver());
    }
}
