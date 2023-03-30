package kk.soft.co.jp.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kk.soft.co.jp.sys.mapper.UserMapper;
import kk.soft.co.jp.sys.model.UserModel;
import kk.soft.co.jp.sys.service.UserService;

@Service
public class UserImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public int insert(UserModel userModel) {

        return userMapper.insert(userModel);
    }
    
    public UserModel checkLogin(UserModel userModel) {

        return userMapper.checkLogin(userModel);
    }
//    public UserModel take(UserModel userModel) {
//
//        return userMapper.take(userModel);
//    }
}
