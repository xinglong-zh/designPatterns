package demo_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "外部员工名字");
        baseInfoMap.put("mobileNumber", "外部员工电话");

        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put("homeTelNumber", "家庭电话");
        homeInfoMap.put("homeAddress", "家庭住址");
        return homeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "办公室职位");
        officeInfo.put("officeTelNumber", "办公电话");
        return officeInfo;
    }
}
