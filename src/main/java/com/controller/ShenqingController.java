package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShenqingEntity;

import com.service.ShenqingService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 贷款申请表
 * 后端接口
 * @author
 * @email
 * @date 2021-02-26
*/
@RestController
@Controller
@RequestMapping("/shenqing")
public class ShenqingController {
    private static final Logger logger = LoggerFactory.getLogger(ShenqingController.class);

    @Autowired
    private ShenqingService shenqingService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        Object role = request.getSession().getAttribute("role");
        PageUtils page = null;
        if(role.equals("学生")){
            params.put("yh",request.getSession().getAttribute("userId"));
            page = shenqingService.queryPage(params);
        }else{
            page = shenqingService.queryPage(params);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        ShenqingEntity shenqing = shenqingService.selectById(id);
        if(shenqing!=null){
            return R.ok().put("data", shenqing);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingEntity shenqing, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<ShenqingEntity> queryWrapper = new EntityWrapper<ShenqingEntity>()
            .eq("dk_types", shenqing.getDkTypes())
            .eq("xs_types", shenqing.getXsTypes())
            .eq("jd_types", shenqing.getJdTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShenqingEntity shenqingEntity = shenqingService.selectOne(queryWrapper);
        if(shenqingEntity==null){
            shenqingService.insert(shenqing);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShenqingEntity shenqing, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<ShenqingEntity> queryWrapper = new EntityWrapper<ShenqingEntity>()
            .notIn("id",shenqing.getId())
            .eq("dk_types", shenqing.getDkTypes())
            .eq("xs_types", shenqing.getXsTypes())
            .eq("jd_types", shenqing.getJdTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShenqingEntity shenqingEntity = shenqingService.selectOne(queryWrapper);
        if(shenqingEntity==null){
            shenqingService.updateById(shenqing);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
     * 学校同意
     */
    @RequestMapping("/consentxx")
    public R consentxx(@RequestBody Integer ids){
        ShenqingEntity shenqing = shenqingService.selectById(ids);
        if(shenqing == null){
           return R.error();
        }
        if(shenqing.getJdTypes()== 2){
            return R.error("您已经同意了，请不要重复点击按钮");
        }
        if(shenqing.getJdTypes()== 3){
            return R.error("这个贷款申请已经完成了哦，请不要重复点击按钮");
        }
        shenqing.setJdTypes(2);
        shenqingService.updateById(shenqing);
        return R.ok();
    }


    /**
     * 银行同意
     */
    @RequestMapping("/consentyh")
    public R consentyh(@RequestBody Integer ids){
        ShenqingEntity shenqing = shenqingService.selectById(ids);
        if(shenqing == null){
            return R.error();
        }
        if(shenqing.getJdTypes()== 1){
            return R.error("学校方还未同意，请不要重复点击按钮");
        }
        if(shenqing.getJdTypes()== 3){
            return R.error("这个贷款申请已经完成了哦，请不要重复点击按钮");
        }
        shenqing.setJdTypes(3);
        shenqingService.updateById(shenqing);
        return R.ok();
    }


    /**
     * 银行同意
     */
    @RequestMapping("/refuse")
    public R refuse(@RequestBody Integer ids){
        ShenqingEntity shenqing = shenqingService.selectById(ids);
        if(shenqing == null){
            return R.error();
        }
        shenqing.setJdTypes(4);
        shenqingService.updateById(shenqing);
        return R.ok();
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        shenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

