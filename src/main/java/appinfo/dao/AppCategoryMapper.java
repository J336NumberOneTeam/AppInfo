package appinfo.dao;

import appinfo.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppCategoryMapper {
    /**
     * 一级分类
     * @param parentId
     * @return
     */
    List<AppCategory> findAppCategoryList(@Param("parentId") Integer parentId);
}
