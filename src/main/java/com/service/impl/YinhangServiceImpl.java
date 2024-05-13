package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.YinhangDao;
import com.entity.YinhangEntity;
import com.service.YinhangService;
import com.entity.view.YinhangView;

/**
 *  服务实现类
 * @author 
 * @since 2021-02-26
 */
@Service("yinhangService")
@Transactional
public class YinhangServiceImpl extends ServiceImpl<YinhangDao, YinhangEntity> implements YinhangService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YinhangView> page =new Query<YinhangView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
