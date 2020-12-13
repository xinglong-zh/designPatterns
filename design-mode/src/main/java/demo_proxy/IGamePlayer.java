package demo_proxy;

/**
 * @author xinglong
 */
public  interface IGamePlayer {
    /** 登录游戏 */
    void login(String user,String password);
    /** 击杀boss */
    void killBoss();
    /** 升级 */
    void upgrade();
}
