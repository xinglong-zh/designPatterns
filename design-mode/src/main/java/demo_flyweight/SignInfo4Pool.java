package demo_flyweight;

import lombok.Data;

/**
 * 对象池尝试 .
 */
@Data
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }


}
