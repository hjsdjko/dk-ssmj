package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinhangEntity;
import java.util.Map;

/**
 *  服务类
 * @author 
 * @since 2021-02-26
 */
public interface YinhangService extends IService<YinhangEntity> {

     PageUtils queryPage(Map<String, Object> params);

}