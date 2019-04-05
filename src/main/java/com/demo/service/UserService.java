package com.demo.service;

import com.demo.model.dto.UserDTO;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/4/4 21:03
 */
public interface UserService {

    /**
     * 通过id查找user
     * @param id id
     * @return user
     */
    UserDTO findById(Long id);
}
