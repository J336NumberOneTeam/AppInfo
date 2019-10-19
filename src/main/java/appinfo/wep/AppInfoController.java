package appinfo.wep;

import appinfo.pojo.*;
import appinfo.service.AppCategoryService;
import appinfo.service.AppInfoService;
import appinfo.service.DataDictionaryService;
import appinfo.util.PageBean;
import com.alibaba.fastjson.JSON;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.naming.NoPermissionException;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.util.List;

@Controller
public class AppInfoController {
    @Resource
    private AppInfoService appInfoService;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;
    @RequestMapping("/dev/flatform/app/list")
    public String  showAppInfoList(Model model, HttpSession session, @ModelAttribute AppInfolListVO appInfolListVO) throws NoPermissionException {
        DevUser devUserSession =(DevUser) session.getAttribute("devUserSession");
        if (devUserSession == null){
            //因为xml里面配置了异常处理 只要出现了异常就会进入403界面
            throw new NoPermissionException();
        }
        PageBean<AppInfo> pages = appInfoService.selectPageBean(appInfolListVO);

        //所属平台
        List<DataDictionary> flatFormList = dataDictionaryService.finflatFormList("APP_FLATFORM");
        //app状态
        List<DataDictionary> statusList = dataDictionaryService.finflatFormList("APP_STATUS");
        //查询一级分类
        List<AppCategory> categoryLevel1List =appCategoryService.findAppCategoryList(null);
        //回显查询数据
        model.addAttribute("querySoftwareName",appInfolListVO.getQuerySoftwareName());
        model.addAttribute("queryStatus",appInfolListVO.getQueryStatus());
        model.addAttribute("queryFlatformId",appInfolListVO.getQueryFlatformId());
        model.addAttribute("queryCategoryLevel1",appInfolListVO.getQueryCategoryLevel1());
        model.addAttribute("queryCategoryLevel2",appInfolListVO.getQueryCategoryLevel2());
        model.addAttribute("queryCategoryLevel3",appInfolListVO.getQueryCategoryLevel3());


        session.setAttribute("devUserSession",devUserSession);
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        model.addAttribute("flatFormList",flatFormList);
        model.addAttribute("statusList",statusList);
        model.addAttribute("pages",pages);
        return "developer/appinfolist";
    }

    @ResponseBody
    @RequestMapping("/dev/flatform/app/categorylevel2list/{level1}")
    public String cgetCategoryleve2list(Model model,@PathVariable Integer level1){

        List<AppCategory> categoryLevel2List =appCategoryService.findAppCategoryList(level1);

        /*if (categoryLevel2List == null){
            throw new RuntimeException();
        }*/
        return JSON.toJSONString(categoryLevel2List);
    }
}
