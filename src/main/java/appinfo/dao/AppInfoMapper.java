package appinfo.dao;

import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfoListVo;
import appinfo.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    /**
     * 查询总记录数
     * @return
     */
    int findTotalCount(AppInfoListVo appInfoListVo);

    /**
     * 查询结果集
     * @param
     * @return
     */
    List<AppInfo> findAppInfoList(AppInfoListVo appInfoListVo);
}
