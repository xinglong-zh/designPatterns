package demo_visitor;

public class Visitor implements IVisitor{
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommomEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManager(manager));
    }


    public String getBasicInfo(Employee employee){
        String info  = "姓名:" + employee.getName() + "\t";
        info = info + "性别" + employee.getSex() +"\t";
        info = info + "薪水" + employee.getSalary() +"\t";
        return info;
    }

    // 组装普通员工消息
    private String getCommomEmployee(CommonEmployee commonEmployee){
        String basicInfo = getBasicInfo(commonEmployee) + "工作:" + commonEmployee.getJob();
        return basicInfo;
    }

    // 组装经理
    private String getManager(Manager manager){
        String basicInfo = getBasicInfo(manager) + "业绩:" + manager.getPerformance();
        return basicInfo;
    }
}
