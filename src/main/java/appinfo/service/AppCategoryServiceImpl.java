package appinfo.service;

import appinfo.dao.AppCategoryMapper;
import appinfo.pojo.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper appCategoryMapper;
    @Override
    public List<AppCategory> findAppCategoryList(Integer parentId) {

        return appCategoryMapper.findAppCategoryList(parentId);
    }
}
