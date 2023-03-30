package kk.soft.co.jp.sys.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kk.soft.co.jp.sys.model.UserModel;
import kk.soft.co.jp.sys.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {

    @Resource
    private UserService userService;
    
    //Index画面系を表示
    @GetMapping("/index")
    public String indexInit() {
    	return "index";
    }
    @PostMapping("/index")
    	public String ind(UserModel userModel, Model model){
        	
        	userService.insert(userModel);

            model.addAttribute("msg","登録完了");
    	return "index";
    }
    

    //新規登録画面系
    @GetMapping("/register")
    public String regInit() {
    	return "register";
    }

    @PostMapping("/register")
    public String reg(UserModel userModel, Model model){
    	
    	userService.insert(userModel);

        model.addAttribute("msg","登録完了");

       return "index";
    }

    
    //ログイン画面系
    @GetMapping("/login")
    public String loginInit() {
    	return "login";
    }
    @PostMapping("/login")
    public String login(UserModel userModel, Model model) {
    	UserModel userinfo = userService.checkLogin(userModel);
    	if(userinfo != null) {
    	  	model.addAttribute("show",userinfo);
    		return "account";
    	}else {
    		 model.addAttribute("msg", "ユーザーとパスワードを入力してください");
    	return "login";
    	}
    }
    
    
    //アカウントの情報を表示
    @GetMapping("/account")
    public String accInit() {
    	return "account";
    }
    @PostMapping("/account")
    public String acc(UserModel userModel, Model model) {
//    	UserModel a = userService.checkLogin(userModel);
//    	model.addAttribute("show",a);
//    	
    return "account";
    
    
    
    }
  //パスワード変更
    @GetMapping("/changepassword")
    public String changePasswordInit() {
        return "changepassword";
    }
    
    @PostMapping("/changepassword")
    public String changePassword(UserModel userModel, Model model) {
		return null;
        
}
}
