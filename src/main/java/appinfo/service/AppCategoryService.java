package appinfo.service;

import appinfo.pojo.AppCategory;

import java.util.List;

public interface AppCategoryService {
    List<AppCategory> findAppCategoryList(Integer parentId);
}
