package com.entity.view;

import com.entity.DaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 贷款项目表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-26
 */
@TableName("daikuan")
public class DaikuanView extends DaikuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public DaikuanView() {

	}

	public DaikuanView(DaikuanEntity daikuanEntity) {
		try {
			BeanUtils.copyProperties(this, daikuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
