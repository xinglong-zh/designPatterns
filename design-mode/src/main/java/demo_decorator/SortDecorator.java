package demo_decorator;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportSort(){
        System.out.println("本次排名为 32");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}
