package com.entity.vo;

import com.entity.ShenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 贷款申请表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-06
 */
@TableName("shenqing")
public class ShenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
