package demo_adapter;

/**
 * Convert the interface of a class into another interface clients expect.Adapter lets classes work
 * together that couldn't otherwise because of incompatible interfaces.（将一个类的接口变换成客户
 * 端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工
 * 作。）
 */
public class Client {
    public static void main(String[] args) {

        IUserInfo userInfo = new OuterUserInfo();
        for (int i=0;i<10;i++){
            userInfo.getMobileNumber();
        }
    }
}
