package appinfo.service;

import appinfo.pojo.AppCategory;

import java.util.List;

public interface AppCategoryService {
    /**
     * 一级分类
     * @param parentId
     * @return
     */
    List<AppCategory> findAppCategoryList(Integer parentId);
}
