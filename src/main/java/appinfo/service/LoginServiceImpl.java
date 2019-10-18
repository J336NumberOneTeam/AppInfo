package appinfo.service;

import appinfo.dao.LoginMapper;
import appinfo.pojo.BackendUser;
import appinfo.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    /**
     * 开发者登录
     * @param devCode
     * @param devPassword
     * @return
     */
    @Override
    public DevUser doLogin(String devCode, String devPassword) {
        return loginMapper.doLogin(devCode,devPassword);
    }

    /**
     * 管理者登录
     * @param userCode
     * @param userPassword
     * @return
     */
    @Override
    public BackendUser managerLogin(String userCode, String userPassword) {
        return loginMapper.managerLogin(userCode,userPassword);
    }
}
