package demo_command;

/**
 * @author Administrator
 * 场景类
 * 命令模式是一个高内聚的模式，其定义为：Encapsulate a request as an object,thereby
 * letting you parameterize clients with different requests,queue or log requests,and support undoable
 * operations.（将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请
 * 求排队或者记录请求日志，可以提供命令的撤销和恢复功能。）
 */
public class Client {
    public static void main(String[] args) {
        Group group = new RequirementGroup();
        group.add();
        group.change();
        group.plan();
        System.out.println("-------命令模式封装后的方法-----");

        Command command = new AddRequirementCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.Action();

        invoker.setCommand(new CancelDeletePageCommand());
        invoker.Action();
    }
}
