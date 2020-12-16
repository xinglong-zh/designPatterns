package demo_decorator;

public class HignScoreDecorator extends Decorator {
    public HignScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore(){
        System.out.println("这次考试的高成绩 88 90 95");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
