package demo_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map<String, String> baseInfo = new HashMap();  // 员工基本信息
    private Map<String, String> homeInfo = new HashMap();   // 员工家庭信息
    private Map<String, String> officeInfo = new HashMap(); //  办公室信息

    @Override
    public String getUserName() {
        return this.baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return this.officeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return this.baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return this.officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return this.officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return this.homeInfo.get("homeTelNumber");
    }
}
