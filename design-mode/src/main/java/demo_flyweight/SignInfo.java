package demo_flyweight;

import lombok.Data;

/**
 * 注册信息
 * 考试科目+考试地点的复合字符串作为唯一的池对象标准
 */
@Data
public class SignInfo {
    /**
     * 注册id
     */
    private String id;
    /**
     * 位置
     */
    private String location;
    /**
     * 科目
     */
    private String subject;
    /**
     * 邮寄地址
     */
    private String postAddress;
}
