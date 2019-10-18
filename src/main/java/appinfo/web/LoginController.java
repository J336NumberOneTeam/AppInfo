package appinfo.web;

import appinfo.pojo.BackendUser;
import appinfo.pojo.DevUser;
import appinfo.service.LoginService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource
    private LoginService loginService;

    //跳转后台管理
    @RequestMapping("/manager/login")
    public String goManagerLogin(){
        return "backendlogin";
    }
    //跳转开发者
    @RequestMapping("/dev/login")
    public String goDevLogin(){
        return "devlogin";
    }

    //开发者登录
    @RequestMapping("/dev/dologin")
    public String doLogin(HttpSession session, @RequestParam String devCode, @RequestParam String devPassword){
     DevUser devUser =loginService.doLogin(devCode,devPassword);
     //判断用户是否存在
        if(devUser==null){
            session.setAttribute("error","用户名或密码错误！");
//            throw new RuntimeException();
        }
        session.setAttribute("devUserSession",devUser);
        return "developer/main";
    }
    //后台管理者登录
    @RequestMapping("manager/dologin")
    public String managerLogin(Model model,@RequestParam String userCode,@RequestParam String userPassword){
        BackendUser backendUser =loginService.managerLogin(userCode,userPassword);
        //判断用户是否存在
        if(backendUser==null){
            model.addAttribute("error","用户名或密码错误！");
            return "backendlogin";
        }
         model.addAttribute("userSession",backendUser);
        return "backend/main";
    }

    //退出
    @RequestMapping("/dev/logout")
    public String devloginOut(HttpSession session){
        //销毁session
        session.invalidate();
        return "redirect:../index.jsp";
    }

}
