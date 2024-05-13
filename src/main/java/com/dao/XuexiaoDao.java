package com.dao;

import com.entity.XuexiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaoView;

/**
 *  Dao 接口
 *
 * @author 
 * @since 2021-02-26
 */
public interface XuexiaoDao extends BaseMapper<XuexiaoEntity> {

   List<XuexiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
