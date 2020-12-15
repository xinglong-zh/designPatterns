package demo_chainHandler;

import java.util.ArrayList;
import java.util.Random;

/**
 * 职责不清晰 , 改用责任链模式
 * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to
 * handle the request.Chain the receiving objects and pass the request along the chain until an object
 * handles it.（使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关
 * 系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）
 *
 * 责任链模式的重点是在“链”上，由一条链去处理相似的请求在链中决定谁来处理这个请
 * 求，并返回相应的结果
 */

public class Client {
    public static void main(String[] args) {
//        Random random = new Random(System.currentTimeMillis());
//        ArrayList<IWomen> arrayList = new ArrayList<>();
//        for (int i=0;i<5;i++){
//            arrayList.add(new Women(random.nextInt(4),"出门"));
//        }
//
//        IHandler father = new Father();
//        IHandler husband = new Husband();
//        IHandler son = new Son();
//        for (IWomen women:arrayList){
//            if (women.getType()==1){
//                // 未出嫁 , 请示父亲
//                father.handleMessage(women);
//            }else if (women.getType()==2){
//                // 出嫁
//                husband.handleMessage(women);
//            }else if (women.getType()==3){
//                // 夫死 ,
//                son.handleMessage(women);
//            }else {
//                // 什么都不做
//            }
//        }

        System.out.println("----------------责任链模式---------------");

       Random random = new Random();
       ArrayList<IWomen> arrayList = new ArrayList<>();
       for (int i=0;i<5;i++){
           arrayList.add(new Women(random.nextInt(4),"出门"));
       }

       Handler father = new FatherChain();
       Handler husband = new HusbandChain();
       Handler son = new SonChain();

       father.setNextHandler(husband);
       husband.setNextHandler(son);

       for (IWomen women:arrayList){
           father.HandleMessage(women);
       }
    }
}
