package demo_observer;

import java.util.Observer;

/**
 * 考虑去掉间谍类
 * Define a one-to-many dependency between objects so that when one object changes state,all its
 * dependents are notified and updated automatically.（定义对象间一种一对多的依赖关系，使得每
 * 当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。）
 *
 * java 的api 提供了工具 ,
 * 观察者过多时  , 需要考虑性能问题 ,
 * 1 为观察者开启线程响应
 * 2  启用缓存技术
 *
 * 3 由被观察者决定是否通知观察者响应
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
//        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi =new HanFeiZi();
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl();
        hanFeiZi.addObserver(o1);
        hanFeiZi.addObserver(o2);


//        Spy watchBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
//        Spy watchFun = new Spy(hanFeiZi,liSi,"fun");
//
//        watchBreakfast.start();
//        watchFun.start();
//
//        Thread.sleep(1000);

        hanFeiZi.haveFun();
        hanFeiZi.haveBreakfast();

    }
}
