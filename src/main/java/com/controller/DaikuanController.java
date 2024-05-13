package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import com.entity.ShenqingEntity;
import com.service.ShenqingService;
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

import com.entity.DaikuanEntity;

import com.service.DaikuanService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 贷款项目表
 * 后端接口
 * @author
 * @email
 * @date 2021-02-26
*/
@RestController
@Controller
@RequestMapping("/daikuan")
public class DaikuanController {
    private static final Logger logger = LoggerFactory.getLogger(DaikuanController.class);

    @Autowired
    private DaikuanService daikuanService;

    @Autowired
    private ShenqingService shenqingService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = daikuanService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        DaikuanEntity daikuan = daikuanService.selectById(id);
        if(daikuan!=null){
            return R.ok().put("data", daikuan);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DaikuanEntity daikuan, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<DaikuanEntity> queryWrapper = new EntityWrapper<DaikuanEntity>()
            .eq("name", daikuan.getName())
            .eq("money", daikuan.getMoney())
            .eq("accrual", daikuan.getAccrual())
            .eq("notice_content", daikuan.getNoticeContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DaikuanEntity daikuanEntity = daikuanService.selectOne(queryWrapper);
        if(daikuanEntity==null){
            daikuanService.insert(daikuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DaikuanEntity daikuan, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<DaikuanEntity> queryWrapper = new EntityWrapper<DaikuanEntity>()
            .notIn("id",daikuan.getId())
            .eq("name", daikuan.getName())
            .eq("money", daikuan.getMoney())
            .eq("accrual", daikuan.getAccrual())
            .eq("notice_content", daikuan.getNoticeContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DaikuanEntity daikuanEntity = daikuanService.selectOne(queryWrapper);
        if(daikuanEntity==null){
            daikuanService.updateById(daikuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
     * 申请
     */
    @RequestMapping("/applyFor")
    public R applyFor(Integer id, String file , HttpServletRequest request){
        DaikuanEntity daikuan = daikuanService.selectById(id);
        if(daikuan == null){
            return R.error();
        }
        ShenqingEntity shenqing = new ShenqingEntity();
        shenqing.setCreateTime(new Date());
        shenqing.setDkTypes(daikuan.getId());
        shenqing.setJdTypes(1);
        shenqing.setProveFile(file);
        if(!request.getSession().getAttribute("role").equals("学生")){
            return R.error("只有学生可以贷款哦");
        }
        shenqing.setXsTypes((Integer) request.getSession().getAttribute("userId"));
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
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        daikuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

