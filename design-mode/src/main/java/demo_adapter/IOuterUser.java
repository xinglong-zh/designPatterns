package demo_adapter;

import java.util.Map;

public interface IOuterUser {
    /**
     * 基本信息
     *
     * @return
     */
    Map getUserBaseInfo();

    /**
     * 工作区域信息
     *
     * @return
     */
    Map getUserOfficeInfo();

    /**
     * 用户家庭信息
     *
     * @return
     */
    Map getUserHomeInfo();
}
