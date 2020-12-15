package demo_command;

/**
 * @author Administrator
 * 逻辑实现组
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("增加一项功能");
    }

    @Override
    public void delete() {
        System.out.println("删除一项功能");
    }

    @Override
    public void change() {
        System.out.println("改变一项功能");
    }

    @Override
    public void plan() {
        System.out.println("代码变更计划");
    }
}
