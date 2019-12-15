package com.macro.mall.portal.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.NmsNews;
import com.macro.mall.portal.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 新闻查看Controller
 * Created by macro on 2019/11/23.
 */
@Controller
@Api(tags = "NewsController", description = "新闻查看 ")
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @ApiOperation("根据新闻ID返回新闻实体内容")
    @RequestMapping(value = "/get/byid",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getnewByid(Integer id){
        NmsNews news=newsService.getnewByid(id);
        return CommonResult.success(news);
    }

    @ApiOperation("根据新闻类别返回实体集")
    @RequestMapping(value = "/get/bycategory",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<NmsNews>> getnewBycategory(Integer categoryID,@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
       List<NmsNews> newList=newsService.getnewBycategory(categoryID, pageSize, pageNum);
        return CommonResult.success(newList);
    }

}
