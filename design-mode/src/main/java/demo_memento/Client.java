package demo_memento;


/**
 * 调用者不应该参与boy 重置状态的操作
 * 需要boy自己来恢复自己的状态
 * <p>
 * 建立一个管理类 , 管理备忘录
 * <p>
 * Without violating encapsulation,capture and externalize an object's internal state so that the
 * object can be restored to this state later.（在不破坏封装性的前提下，捕获一个对象的内部状
 * 态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。）
 * <p>
 * ;利用原型模式的clone 可以 在一个类中实现备忘录模式 , 备忘录的管理也可以实现 .  有深拷贝 , 浅拷贝的问题
 * <p>
 * 多状态备份 , 可以把属性, 状态放在一个 hash map 中 ,
 * <p>
 * 多备份 , caretaker  , 使用map  ,  保存多个备份 , 业绩检查点.
 * <p>
 * 控制数据的访问 , 可以使用双接口 , 一个接口实现逻辑 ,  一个接口被内部类实现 , 控制数据访问 .
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setStatus("心情很好");
        System.out.println(boy.getStatus());
        Boy backUp = new Boy();
        // 保存现在的状态
        backUp.setStatus(boy.getStatus());

        boy.setStatus("心情不好");

        // 恢复
        boy.setStatus(backUp.getStatus());
        System.out.println(boy.getStatus());


        System.out.println("---------------");
        Boy boy1 = new Boy();
        boy1.setStatus("心情很好");

//        创建一个备份
        Memento memento = boy1.createMemento();

        boy1.setStatus("心情不ok");
        System.out.println(boy1.getStatus());

        // 恢复备份

        boy1.restoreMemento(memento);

        System.out.println(boy1.getStatus());

        System.out.println("-------------管理备忘录--------------");

        Boy boy2 = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setStatus("心情很好");
        System.out.println(boy.getStatus());

        caretaker.setMemento(boy2.createMemento());

        boy2.changeState();

        System.out.println(boy2.getStatus());

        // 恢复
        boy2.restoreMemento(caretaker.getMemento());

        System.out.println(boy2.getStatus());
    }
}
