package demo_command;

/**
 * @author Administrator
 * 需求组
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("增加一个需求");
    }

    @Override
    public void delete() {
        System.out.println("删除一个需求");
    }

    @Override
    public void change() {
        System.out.println("改变一个需求");
    }

    @Override
    public void plan() {
        System.out.println("需求计划变更");
    }
}
