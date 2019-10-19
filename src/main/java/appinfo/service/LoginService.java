package appinfo.service;

import appinfo.pojo.DevUser;

public interface LoginService {
    DevUser doLogin(String devCode, String devPassword);
}
