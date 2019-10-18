package appinfo.service;

import appinfo.pojo.BackendUser;
import appinfo.pojo.DevUser;

public interface LoginService {
    /**
     * 开发者登录
     * @param devCode
     * @param devPassword
     * @return
     */
    DevUser doLogin(String devCode, String devPassword);

    /**
     * 管理者登录
     * @param userCode
     * @param userPassword
     * @return
     */
    BackendUser managerLogin(String userCode, String userPassword);
}
