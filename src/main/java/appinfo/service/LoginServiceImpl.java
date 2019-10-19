package appinfo.service;

import appinfo.dao.LoginMapper;
import appinfo.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 登录
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public DevUser doLogin(String devCode, String devPassword) {
        return loginMapper.doLogin(devCode,devPassword);
    }
}
