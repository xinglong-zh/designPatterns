package demo_proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer gamePlayer,String name){
        if (gamePlayer==null){
            System.out.println("接口为空 , 不能创建用户");
        }else{
            this.name =name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println(user+":"+this.name+"登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"升级了");
    }
}
