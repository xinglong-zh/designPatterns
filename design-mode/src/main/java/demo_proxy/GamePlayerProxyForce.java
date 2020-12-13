package demo_proxy;

/**
 * 强制代理类
 */
public class GamePlayerProxyForce implements IGamePlayerForce {

    private IGamePlayerForce gamePlayer =null;
    public GamePlayerProxyForce(IGamePlayerForce gamePlayer){
        this.gamePlayer = gamePlayer;
    }
    @Override
    public void login(String user, String password) {
        gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.before();
        gamePlayer.killBoss();
        this.after();
    }

    @Override
    public void upgrade() {
        this.before();
        gamePlayer.upgrade();
        this.after();
    }

    @Override
    public IGamePlayerForce getProxy() {
        return this;
    }

    public void before(){
        System.out.println("模拟增加日志");
    }

    public void after(){
        System.out.println("模拟声明事物");
    }
}
