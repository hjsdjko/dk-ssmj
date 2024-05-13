package com.entity.view;

import com.entity.YinhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-26
 */
@TableName("yinhang")
public class YinhangView extends YinhangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public YinhangView() {

	}

	public YinhangView(YinhangEntity yinhangEntity) {
		try {
			BeanUtils.copyProperties(this, yinhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
