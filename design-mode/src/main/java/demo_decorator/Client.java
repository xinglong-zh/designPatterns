package demo_decorator;

/**
 * 装饰模式（Decorator Pattern）是一种比较常见的模式，其定义如下：Attach additional
 * responsibilities to an object dynamically keeping the same interface.Decorators provide a flexible
 * alternative to subclassing for extending functionality.（动态地给一个对象添加一些额外的职责。
 * 就增加功能来说，装饰模式相比生成子类更为灵活。）
 *
 * ??? 非常像代理模式
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport schoolReport;
        schoolReport=  new FouthGradeSchoolReport();
        schoolReport = new HignScoreDecorator(schoolReport);
        schoolReport.report();

        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
    }
}
