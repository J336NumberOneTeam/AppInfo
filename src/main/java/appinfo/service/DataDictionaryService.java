package appinfo.service;

import appinfo.pojo.DataDictionary;

import java.util.List;

public interface DataDictionaryService {
    List<DataDictionary> findflatFormList(String app_status);
}
