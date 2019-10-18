package appinfo.web;

import appinfo.pojo.*;
import appinfo.service.AppCategoryService;
import appinfo.service.AppInfoSrvice;
import appinfo.service.DataDictionaryService;
import appinfo.util.PageBean;
import com.alibaba.fastjson.JSON;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.naming.NoPermissionException;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AppinfoContrller {
    @Resource
    private AppInfoSrvice appInfoSrvice;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;
    @RequestMapping("/dev/flatform/app/list")
    public String showAppInfoList(Model model, HttpSession session,@ModelAttribute AppInfoListVo appInfoListVo)throws NoPermissionException{
        DevUser devUserSession=(DevUser)session.getAttribute("devUserSession");
        if(devUserSession==null){
//            //因为xml里面配置了异常处理，只要出现了异常就会进入403界面
            throw new NoPermissionException();
        }

       PageBean<AppInfo> pages=appInfoSrvice.selectPageBean(appInfoListVo);


        //app状态
       List<DataDictionary>  statusList=dataDictionaryService.findflatFormList("APP_STATUS");
        //所属平台
        List<DataDictionary> flatFormList=dataDictionaryService.findflatFormList("APP_FLATFORM");

        //查询一级分类
        List<AppCategory> categoryLevel1List=appCategoryService.findAppCategoryList(null);
        //回显查询数据
        model.addAttribute("querySoftwareName",appInfoListVo.getQuerySoftwareName());
        model.addAttribute("queryStatus",appInfoListVo.getQueryStaus());
        model.addAttribute("quertFlatformId",appInfoListVo.getQuertFlatformId());
        model.addAttribute("queryCategoryLevel1",appInfoListVo.getQueryCategoryLevel1());
        model.addAttribute("queryCategoryLevel2",appInfoListVo.getQueryCategoryLevel2());
        model.addAttribute("queryCategoryLevel3",appInfoListVo.getQueryCategoryLevel3());
        model.addAttribute("appInfoListVo",appInfoListVo);
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
//       if(categoryLevel2List==null){
//           throw new RuntimeException();
//       }
        return JSON.toJSONString(categoryLevel2List);
    }

}
