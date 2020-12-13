package demo_proxy;

public interface IGamePlayerForce {
    void login(String user,String password);
    void killBoss();
    void upgrade();
    IGamePlayerForce getProxy();
}
