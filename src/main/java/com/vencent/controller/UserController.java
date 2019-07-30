package com.vencent.controller;


import java.security.Principal;
import java.util.List;

import com.vencent.pojo.SysUser;
import com.vencent.pojo.Text;
import com.vencent.services.TextService;
import com.vencent.services.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
     private UserService userService;

    @Resource
    private TextService textService;



    /*
    跳转注册界面
     */
    @RequestMapping("/goRegister")
    public String goRegister(){

        return "/user/register.jsp";
    }
/*
登录
 */
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView login(Principal principal,HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        //获得当前登录用户信息
       SysUser sysUser = userService.SelectByUsername(principal.getName());
       session.setAttribute("user",sysUser);
        session.setAttribute("UserId",sysUser.getId());
        session.setAttribute("username",principal.getName());
        List<Text> texts = textService.selectAll();
        long num = 0;
        if (!texts.isEmpty()) {
            num = texts.size();
        }
        modelAndView.addObject("texts",texts);
        modelAndView.addObject("num",num);
        modelAndView.setViewName("index");
        return modelAndView;
    }
/*
     注册用户
 */
    @RequestMapping( value = "/register", method = RequestMethod.POST)
    public String register(SysUser user){
        user.setUsername("新用户");
       boolean result =  userService.AddUser(user);
       if (!result){
           System.out.println("该邮箱已注册，请更换邮箱");

       }
        return "redirect:login.jsp";
    }

    /*
   跳转到文章界面
    */
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
    /*
    跳转到关于界面
     */
    @RequestMapping("/about")
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("about");

        return modelAndView;
    }
    /*
    跳转到微语界面
     */
    @RequestMapping("/whisper")
    public String whisper(){

        return "whisper";
    }
    /*
    跳转到留言界面
     */
    @RequestMapping(value = "/leacots")
    public String reply(){

        return "leacots";
    }

    /*
    跳转到相册界面
     */
    @RequestMapping("album")
    public String album(){

        return "album";
    }
}
