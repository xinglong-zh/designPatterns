package demo_decorator;

public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new FouthGradeSchoolReport();
        schoolReport.report();
        schoolReport.sign("xxx");

        SchoolReport sugerFouthGradeSchoolReport = new SugerFouthGradeSchoolReport();
        sugerFouthGradeSchoolReport.report();
        sugerFouthGradeSchoolReport.sign("ok");
    }
}
