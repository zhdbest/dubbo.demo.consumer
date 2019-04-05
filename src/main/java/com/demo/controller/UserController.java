package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.model.dto.UserDTO;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/4/5 11:36
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("findById")
    @ResponseBody
    public String findById(Long id) {
        UserDTO userDTO = userService.findById(id);
        return userDTO == null ? "没找到" : String.format("我叫%s，id是%d，%d岁，家住%s。",
                userDTO.getName(),
                userDTO.getId(),
                userDTO.getAge(),
                userDTO.getAddress());
    }
}
