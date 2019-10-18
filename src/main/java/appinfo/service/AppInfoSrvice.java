package appinfo.service;

import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfoListVo;
import appinfo.util.PageBean;

public interface AppInfoSrvice {
    //分页查询
    PageBean<AppInfo> selectPageBean(AppInfoListVo appInfoListVo);
}
