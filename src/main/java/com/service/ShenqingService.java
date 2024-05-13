package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingEntity;
import java.util.Map;

/**
 * 贷款申请表 服务类
 * @author 
 * @since 2021-02-26
 */
public interface ShenqingService extends IService<ShenqingEntity> {

     PageUtils queryPage(Map<String, Object> params);

}