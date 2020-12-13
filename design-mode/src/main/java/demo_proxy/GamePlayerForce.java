package demo_proxy;

public class GamePlayerForce implements IGamePlayerForce {
    private String name = "";
    private IGamePlayerForce proxy = null;

    public GamePlayerForce(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("用户登录");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println("打boss");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println("升级");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public IGamePlayerForce getProxy() {
        this.proxy = new GamePlayerProxyForce(this);
        return this.proxy;
    }

    public boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
