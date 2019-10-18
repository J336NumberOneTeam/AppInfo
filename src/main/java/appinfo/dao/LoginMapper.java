package appinfo.dao;

import appinfo.pojo.BackendUser;
import appinfo.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    /**
     * 开发者登录
     * @param devCode
     * @param devPassword
     * @return
     */
    DevUser doLogin(@Param("devCode") String devCode,@Param("devPassword") String devPassword);

    /**
     * 管理者登录
     * @param userCode
     * @param userPassword
     * @return
     */
    BackendUser managerLogin(@Param("userCode") String userCode,@Param("userPassword") String userPassword);
}
