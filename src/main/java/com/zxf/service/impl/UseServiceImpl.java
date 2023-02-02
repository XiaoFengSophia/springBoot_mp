package com.zxf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxf.entity.User;
import com.zxf.mapper.UserMapper;
import com.zxf.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author:zxf
 * @create: 2023-01-30 10:30
 * @Description: 实现类
 * @Company: 白云信科·研发中心·研发三室
 */
@Service
public class UseServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
