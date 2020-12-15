package demo_command;

/**
 * @author Administrator
 * ui 设计组
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("改变一个页面");
    }

    @Override
    public void plan() {
        System.out.println("页面变更计划");
    }
}
