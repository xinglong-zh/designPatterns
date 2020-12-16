package demo_observer;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi =new HanFeiZi();


        Spy watchBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
        Spy watchFun = new Spy(hanFeiZi,liSi,"fun");

        watchBreakfast.start();
        watchFun.start();

        Thread.sleep(1000);

        hanFeiZi.haveFun();
        hanFeiZi.haveBreakfast();

    }
}
