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
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 贷款项目表
 *
 * @author 
 * @email
 * @date 2021-02-26
 */
@TableName("daikuan")
public class DaikuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaikuanEntity() {

	}

	public DaikuanEntity(T t) {
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
     * 贷款名称 Search
     */
    @TableField(value = "name")
    private String name;


    /**
     * 贷款金额
     */
    @TableField(value = "money")
    private Integer money;


    /**
     * 利息
     */
    @TableField(value = "accrual")
    private String accrual;


    /**
     * 具体内容
     */
    @TableField(value = "notice_content")
    private String noticeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 设置：贷款名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：贷款名称 Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：贷款金额
	 */
    public Integer getMoney() {
        return money;
    }


    /**
	 * 获取：贷款金额
	 */

    public void setMoney(Integer money) {
        this.money = money;
    }
    /**
	 * 设置：利息
	 */
    public String getAccrual() {
        return accrual;
    }


    /**
	 * 获取：利息
	 */

    public void setAccrual(String accrual) {
        this.accrual = accrual;
    }
    /**
	 * 设置：具体内容
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：具体内容
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
