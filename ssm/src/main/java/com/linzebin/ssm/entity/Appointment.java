package com.linzebin.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * 预约图书实体
 */
@Data
public class Appointment {

    private long bookId;// 图书ID

    private long studentId;// 学号

    private Date appointTime;// 预约时间

    // 多对一的复合属性
    private Book book;// 图书实体

    // 省略构造方法，getter和setter方法，toString方法

}
