package com.zxf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author:zxf
 * @create: 2023-01-30 09:57
 * @Description: 用户
 * @Company: 白云信科·研发中心·研发三室
 */
@Data
@TableName("user")
public class User {

    /**
     *主键
     */
    @TableId("id")
    private String id;

    /**
     *姓名
     */
    @TableField("username")
    private String username;

    /**
     *性别
     */
    @TableField("sex")
    private String sex;

    /**
     *证件号
     */
    @TableField("idcard")
    private String idcard;

    /**
     *出生年月
     */
    @TableField("birth")
    private String birth;


}
