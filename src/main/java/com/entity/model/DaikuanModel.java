package com.entity.model;

import com.entity.DaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 贷款项目表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-02-26
 */
public class DaikuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 贷款名称 Search
     */
    private String name;


    /**
     * 课程时间
     */
    private String course;


    /**
     * 贷款金额
     */
    private Integer money;


    /**
     * 利息
     */
    private String accrual;


    /**
     * 具体内容
     */
    private String noticeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 设置：课程时间
	 */
    public String getCourse() {
        return course;
    }


    /**
	 * 获取：课程时间
	 */

    public void setCourse(String course) {
        this.course = course;
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
