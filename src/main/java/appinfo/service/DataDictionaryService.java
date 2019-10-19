package appinfo.service;

import appinfo.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryService {
    List<DataDictionary> finflatFormList(String app_flatform);
}
