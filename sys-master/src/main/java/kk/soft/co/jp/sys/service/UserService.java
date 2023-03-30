package kk.soft.co.jp.sys.service;

import kk.soft.co.jp.sys.model.UserModel;

public interface UserService {

    public int insert(UserModel userModel);
    public UserModel checkLogin(UserModel userModel);
//    public UserModel take(UserModel userModel);

}
