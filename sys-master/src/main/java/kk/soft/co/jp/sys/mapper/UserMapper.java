package kk.soft.co.jp.sys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kk.soft.co.jp.sys.model.UserModel;

@Repository
@Mapper
public interface UserMapper {

    int insert(UserModel userModel);
    UserModel checkLogin(UserModel userModel);
//    UserModel take(UserModel userModel);
}
