package appinfo.dao;

import appinfo.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryMapper {
    List<DataDictionary> findflatFormList(String app_status);
}
