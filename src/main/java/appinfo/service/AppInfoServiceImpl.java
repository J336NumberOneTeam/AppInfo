package appinfo.service;

import appinfo.dao.AppInfoMapper;
import appinfo.pojo.AppInfo;
import appinfo.pojo.AppInfoListVo;
import appinfo.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppInfoServiceImpl implements AppInfoSrvice{
    @Resource
    private AppInfoMapper appInfoMapper;
    /**
     * 分页查询
     * @param
     */
    @Override
    public PageBean selectPageBean(AppInfoListVo appInfoListVo) {
        PageBean<AppInfo> pages=new PageBean<AppInfo>();
        //获取总记录数
        pages.setPageSize(5);
        pages.setCurrentPage(1);
        if(appInfoListVo.getPageIndex()!=null){
            pages.setCurrentPage(appInfoListVo.getPageIndex());
        }
        //设置起始页
        appInfoListVo.setStartIndex(pages.getStartIndex());
        appInfoListVo.setPageSize(5);
        int count=appInfoMapper.findTotalCount(appInfoListVo);
        pages.setTotalCount(count);
        //获取结果集
        List<AppInfo> appInfoList =appInfoMapper.findAppInfoList(appInfoListVo);
        pages.setResult(appInfoList);
        return pages;
    }
}
