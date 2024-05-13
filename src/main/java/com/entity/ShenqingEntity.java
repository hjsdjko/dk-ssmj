package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 贷款申请表
 *
 * @email
 * @date 2021-03-06
 */
@TableName("shenqing")
public class ShenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShenqingEntity() {

	}

	public ShenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")
    private Integer id;


    /**
     * 贷款项目 Search
     */
    @TableField(value = "dk_types")
    private Integer dkTypes;


    /**
     * 申请人
     */
    @TableField(value = "xs_types")
    private Integer xsTypes;


    /**
     * 申请进度 Search
     */
    @TableField(value = "jd_types")
    private Integer jdTypes;


    /**
     * 资料上传
     */
    @TableField(value = "prove_file")
    private String proveFile;


    /**
     * 申请时间
     */
    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：贷款项目 Search
	 */
    public Integer getDkTypes() {
        return dkTypes;
    }


    /**
	 * 获取：贷款项目 Search
	 */

    public void setDkTypes(Integer dkTypes) {
        this.dkTypes = dkTypes;
    }
    /**
	 * 设置：申请人
	 */
    public Integer getXsTypes() {
        return xsTypes;
    }


    /**
	 * 获取：申请人
	 */

    public void setXsTypes(Integer xsTypes) {
        this.xsTypes = xsTypes;
    }
    /**
	 * 设置：申请进度 Search
	 */
    public Integer getJdTypes() {
        return jdTypes;
    }


    /**
	 * 获取：申请进度 Search
	 */

    public void setJdTypes(Integer jdTypes) {
        this.jdTypes = jdTypes;
    }
    /**
	 * 设置：资料上传
	 */
    public String getProveFile() {
        return proveFile;
    }


    /**
	 * 获取：资料上传
	 */

    public void setProveFile(String proveFile) {
        this.proveFile = proveFile;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
