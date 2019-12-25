package com.cskaoyan.mall.bean;

import lombok.Data;

@Data
public class BaseReqVo<T> {
    //kjfdkasjd
    T data;
    String errmsg;
    int errno;
}
