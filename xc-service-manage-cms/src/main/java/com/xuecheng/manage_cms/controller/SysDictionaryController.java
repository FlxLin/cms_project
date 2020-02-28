package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.SysDictionaryControllerApi;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.service.SysDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ServiceProject
 * @description:
 * @author: Linn
 * @create: 2020-02-28 19:42
 **/
@RestController
@RequestMapping("/sys")
public class SysDictionaryController implements SysDictionaryControllerApi {
    @Autowired
    SysDictionaryService sysDictionaryService;

    @Override
    @GetMapping("/dictionary/get/{type}")
    public SysDictionary getByType(@PathVariable("type") String type) {
        return sysDictionaryService.getByType(type);
    }
}
