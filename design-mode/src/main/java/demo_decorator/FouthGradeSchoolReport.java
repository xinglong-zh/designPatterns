package demo_decorator;

public class FouthGradeSchoolReport extends SchoolReport{

    @Override
    void report() {
        System.out.println("尊敬的家长:");
        System.out.println("语文 88 数学 88 英语88");
        System.out.println("请签字");
    }

    @Override
    void sign(String name) {
        System.out.println("家长签名为:"+ name);

    }
}
