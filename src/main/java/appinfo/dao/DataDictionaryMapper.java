package appinfo.dao;

import appinfo.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryMapper {
    List<DataDictionary> finflatFormList(String app_flatform);
}
