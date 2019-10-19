package appinfo.service;

import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfolListVO;
import appinfo.util.PageBean;

public interface AppInfoService {
    PageBean<AppInfo> selectPageBean(AppInfolListVO appInfolListVO);
}
