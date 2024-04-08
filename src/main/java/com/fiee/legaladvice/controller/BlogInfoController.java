package com.fiee.legaladvice.controller;

import com.fiee.legaladvice.dto.BlogBackInfoDTO;
import com.fiee.legaladvice.service.BlogInfoService;
import com.fiee.legaladvice.service.WebsiteConfigService;
import com.fiee.legaladvice.utils.Result;
import com.fiee.legaladvice.vo.WebsiteConfigVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Fiee
 * @ClassName: blogInfoController
 * @Date: 2024/4/8
 * @Version: v1.0.0
 **/

@Api(tags = "博客信息模块")
@RestController
@RequestMapping("/admin")
public class BlogInfoController {
    @Autowired
    private BlogInfoService blogInfoService;
    @Autowired
    private WebsiteConfigService websiteConfigService;
    /**
     * 查看后台信息
     *
     * @return {@link Result<BlogBackInfoDTO>} 后台信息
     */
    @ApiOperation(value = "查看后台信息")
    @GetMapping("/")
    public Result<BlogBackInfoDTO> getBlogBackInfo() {
        return Result.ok(blogInfoService.getBlogBackInfo());
    }

    @ApiOperation(value = "查看博客配置信息")
    @GetMapping("/website/config")
    public Result<WebsiteConfigVO> getWebsiteConfig(){
        WebsiteConfigVO websiteConfig = websiteConfigService.getWebsiteConfig();
        return Result.ok(websiteConfig);
    }

    @ApiOperation(value = "保存网站配置信息")
    @PostMapping("/website/config")
    public Result saveWebsiteConfig(@RequestBody WebsiteConfigVO vo){
        websiteConfigService.saveWebsiteConfig(vo);
        return Result.ok();
    }
}
