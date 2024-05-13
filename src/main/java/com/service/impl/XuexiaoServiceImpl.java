package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.XuexiaoDao;
import com.entity.XuexiaoEntity;
import com.service.XuexiaoService;
import com.entity.view.XuexiaoView;

/**
 *  服务实现类
 * @author 
 * @since 2021-02-26
 */
@Service("xuexiaoService")
@Transactional
public class XuexiaoServiceImpl extends ServiceImpl<XuexiaoDao, XuexiaoEntity> implements XuexiaoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XuexiaoView> page =new Query<XuexiaoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
