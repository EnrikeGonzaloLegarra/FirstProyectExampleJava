package com.intelygenz.springboot.services;

import com.intelygenz.springboot.entity.User;
import java.util.List;


public interface UserService {

     User findById(Long id);
     List<User> findAll();
     User save(User user);
     User update(User user);
     void delete(Long id);

}
