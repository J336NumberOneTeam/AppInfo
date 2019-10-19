package appinfo.service;

import appinfo.dao.AppInfoMapper;
import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfolListVO;
import appinfo.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public PageBean selectPageBean(AppInfolListVO appInfolListVO) {
        PageBean<AppInfo> pages = new PageBean<AppInfo>();
        //获取总记录数
        pages.setPageSize(5);
        pages.setCurrentPage(1);
        if (appInfolListVO.getPageIndex() != null){
            pages.setCurrentPage(appInfolListVO.getPageIndex());
        }
        //设置起始页
        appInfolListVO.setStartIndex(pages.getStartIndex());
        appInfolListVO.setPageSize(5);

        int count = appInfoMapper.findTotalCount(appInfolListVO);
        pages.setTotalCount(count);
        //获取结果集
        List<AppInfo> appInfoList = appInfoMapper.findAppInfoList(appInfolListVO);
        pages.setResult(appInfoList);
        return pages;
    }
}
