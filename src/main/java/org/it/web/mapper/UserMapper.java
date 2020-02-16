package org.it.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.it.web.bean.User;

@Mapper
public interface UserMapper {

    public User getUserById(Integer id);
    public User getUserByName(String username);
    public void insertUser(User user);
    public void UpdataUserById(Integer id);
}
