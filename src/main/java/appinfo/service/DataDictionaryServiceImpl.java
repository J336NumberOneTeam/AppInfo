package appinfo.service;

import appinfo.dao.DataDictionaryMapper;
import appinfo.pojo.DataDictionary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;
    @Override
    public List<DataDictionary> finflatFormList(String app_flatform) {

        return dataDictionaryMapper.finflatFormList(app_flatform);
    }
}
