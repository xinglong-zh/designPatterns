package demo_observer;

public class Spy extends Thread{
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Spy(HanFeiZi hanFeiZi,LiSi liSi,String type){
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            if (this.type.equals("breakfast")){
                if(this.hanFeiZi.isHavingBreakfast()){
                    this.liSi.update("在吃饭");
                    this.hanFeiZi.setHavingFun(false);
                }
            }else {
                if (this.hanFeiZi.isHavingFun()){
                    this.liSi.update("在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
