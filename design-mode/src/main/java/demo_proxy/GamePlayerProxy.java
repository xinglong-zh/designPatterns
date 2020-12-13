package demo_proxy;

/** 普通代理类
 *
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

//    public GamePlayerProxy(IGamePlayer gamePlayer) {
//        this.gamePlayer = gamePlayer;
//    }
    public GamePlayerProxy(String name){
        try {
            gamePlayer = new GamePlayer(this,name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        gamePlayer.login(user, password);

    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();

    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();

    }
}
