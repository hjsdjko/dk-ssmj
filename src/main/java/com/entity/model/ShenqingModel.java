package com.entity.model;

import com.entity.ShenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 贷款申请表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-06
 */
public class ShenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 贷款项目 Search
     */
    private Integer dkTypes;


    /**
     * 申请人
     */
    private Integer xsTypes;


    /**
     * 申请进度 Search
     */
    private Integer jdTypes;


    /**
     * 资料上传
     */
    private String proveFile;


    /**
     * 申请时间
     */
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
