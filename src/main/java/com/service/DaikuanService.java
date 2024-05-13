package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaikuanEntity;
import java.util.Map;

/**
 * 贷款项目表 服务类
 * @author 
 * @since 2021-02-26
 */
public interface DaikuanService extends IService<DaikuanEntity> {

     PageUtils queryPage(Map<String, Object> params);

}