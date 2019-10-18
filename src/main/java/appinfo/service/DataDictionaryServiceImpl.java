package appinfo.service;

import appinfo.dao.DataDictionaryMapper;
import appinfo.pojo.DataDictionary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService{
    @Resource
   private DataDictionaryMapper dataDictionaryMapper;
    @Override
    public List<DataDictionary> findflatFormList(String app_status) {
        return dataDictionaryMapper.findflatFormList(app_status);
    }
}
