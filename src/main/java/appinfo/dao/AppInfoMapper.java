package appinfo.dao;

import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfolListVO;
import appinfo.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    /**
     * 查询总记录数
     * @return
     */
    int findTotalCount(AppInfolListVO appInfolListVO);

    /**
     * 查询分页后的结果集
     * @param appInfolListVO
     * @return
     */
    List<AppInfo> findAppInfoList(AppInfolListVO appInfolListVO);
}
