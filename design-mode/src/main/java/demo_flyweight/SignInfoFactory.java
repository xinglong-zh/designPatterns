package demo_flyweight;

import java.util.HashMap;

/**
 * 工厂方法 , 返回一个对象
 */
public class SignInfoFactory {
    /**
     * 存放共享对象的地方
     */
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    /**
     * 返回一个共享对象
     *
     * @deprecated 方法已经过时 , 采用对象池的方法代替 .
     */
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    /**
     * 提供新的方法 , 从对象池中取出对象 .
     * @param key  对象池的key
     * @return  返回一个池化后的对象
     */
    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            // 对象池中不存在 , 创建一个 , 放入对象池
            System.out.println("--------对象池中不存在对象---------");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            System.out.println("从对象池中取出对象");
            result = pool.get(key);
        }

        return result;
    }
}
