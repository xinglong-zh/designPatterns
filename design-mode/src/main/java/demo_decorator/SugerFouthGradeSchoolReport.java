package demo_decorator;

public class SugerFouthGradeSchoolReport extends FouthGradeSchoolReport{
    /**
     * 汇报最高成绩
     */
    private void reportHighScore(){
        System.out.println("此次最高成绩为:88 90 75");
    }

    /**
     * 汇报成绩排名
     */
    private void reportSort(){
        System.out.println("成绩排名20...");
    }

    @Override
    void report() {
        reportHighScore();
        super.report();
        reportSort();
    }
}
