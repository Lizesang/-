package huat.shp.controller;

import org.springframework.stereotype.Controller;

import huat.shp.service.CatelogService;

import javax.annotation.Resource;

/**
 */
@Controller
public class CatelogController {
    @Resource
    private CatelogService catelogService;

}
