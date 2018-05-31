package com.front.api.controller;

import com.front.api.responseBody.DocListDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by wei yong
 **/
@RestController
public class DocController {
    @GetMapping(value = "/doc/pageList")
    @ApiOperation(value = "获取文章列表", notes = "按照时间倒叙排列")
    public List<DocListDTO> getDocList(){
        return new ArrayList<>(Arrays.asList(new DocListDTO()));
    }



}
