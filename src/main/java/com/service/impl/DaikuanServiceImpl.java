package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.DaikuanDao;
import com.entity.DaikuanEntity;
import com.service.DaikuanService;
import com.entity.view.DaikuanView;

/**
 * 贷款项目表 服务实现类
 * @author 
 * @since 2021-02-26
 */
@Service("daikuanService")
@Transactional
public class DaikuanServiceImpl extends ServiceImpl<DaikuanDao, DaikuanEntity> implements DaikuanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DaikuanView> page =new Query<DaikuanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
