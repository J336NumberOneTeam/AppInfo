package appinfo.dao;

import appinfo.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    /**
     * 开发者登录
     * @param devCode
     * @param devPassword
     * @return
     */
    DevUser doLogin(@Param("name") String devCode,@Param("pwd") String devPassword);
}
