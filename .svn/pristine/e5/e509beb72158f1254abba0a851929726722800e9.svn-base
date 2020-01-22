package com.gobestsoft.bigdata.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class PageController {

    private static final String SUFFIX_PATH = "/bigData";
    private static final String SUFFIX_PATH_MAP = "/bigData/indexmap";

    @GetMapping("/login")
    public String login() {
        return SUFFIX_PATH + "/login";
    }

    @GetMapping("/index*")
    public String index() {
        return SUFFIX_PATH + "/index";
    }

    @GetMapping("/indexmap/index.html")
    public String indexMap() {
        return SUFFIX_PATH_MAP + "/index";
    }

    @GetMapping("/indexmap/index-1.html")
    public String index1() {
        return SUFFIX_PATH_MAP + "/index-1";
    }

    @GetMapping("/indexmap/index-2.html")
    public String index2() {
        return SUFFIX_PATH_MAP + "/index-2";
    }

    @GetMapping("/indexmap/index_bk.html")
    public String indexBk() {
        return SUFFIX_PATH_MAP + "/index_bk";
    }

    @GetMapping("/indexmap/data-mobile.html")
    public String dataMobile() {
        return SUFFIX_PATH_MAP + "/data-mobile";
    }

    @GetMapping("/indexmap/data-mobileall.html")
    public String dataMobileAll() {
        return SUFFIX_PATH_MAP + "/data-mobileall";
    }

}
