package demo_proxy;

/**
 * @author xinglong
 * 代理类可以实现接口的同时进行增强, 比如给接口增加日志 , 声明式事物.
 */
public class Client {
    public static void main(String[] args) {
//        IGamePlayer gamePlayer = new GamePlayer("小李");
//        // 登录
//        gamePlayer.login("xx", "yy");
//        // 打boss
//        gamePlayer.killBoss();
////        升级
//        gamePlayer.upgrade();
//
//        /** 下面是静态代理的方法 */
//        System.out.println("静态代理的方法---------");
//        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("张三","xxx");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();
//        System.out.println("静态代理的方法---------");
//
//        System.out.println("动态代理方法");
//
//        DynaProxy dynaProxy = new DynaProxy(gamePlayer);
//        IGamePlayer proxy =(IGamePlayer) dynaProxy.getProxy();
//        proxy.login("小张","yyy");

        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy("小明");
        gamePlayerProxy.login("xx","y");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();


        GamePlayerForce gamePlayerForce = new GamePlayerForce("名字");
//        GamePlayerProxyForce playerProxyForce = new GamePlayerProxyForce(gamePlayerForce);
        IGamePlayerForce proxy = gamePlayerForce.getProxy();
        proxy.killBoss();




    }
}
