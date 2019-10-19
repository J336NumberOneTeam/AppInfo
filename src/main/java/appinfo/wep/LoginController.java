package appinfo.wep;

import appinfo.pojo.DevUser;
import appinfo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping("/manager/login")
    public String goManagerLogin(){
        return "backendlogin";
    }
    @RequestMapping("/dev/login")
    public String goDevLogin(){
        return "devlogin";
    }
    //开发者登录
    @RequestMapping("/dev/dologin")
    public  String doLogin(HttpSession session, @RequestParam String devCode, @RequestParam String devPassword ){

      DevUser devUser = loginService.doLogin(devCode,devPassword);

      //判断用户是否存在
        if (devUser == null){
            session.setAttribute("error","有用户名或者密码错误!");
            return "devlogin";
        }
        session.setAttribute("devUserSession",devUser);
        return "developer/main";

    }

    //登出
    @RequestMapping("/dev/logout")
    public String devLoginOut(HttpSession session){
        //销毁session
       session.invalidate();
       return  "redirect:../index.jsp";
    }
}
