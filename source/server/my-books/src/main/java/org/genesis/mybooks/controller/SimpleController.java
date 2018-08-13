package org.genesis.mybooks.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: KG
 * @description:
 * @date: Created in 下午7:37 2018/8/3
 * @modified by:
 */

@Api("Demo Simple Crontroller")
@RestController
@RequestMapping("/simple")
public class SimpleController {

    @ApiOperation(value = "Simple Map Set")
    @GetMapping(value = "/hello")
    public @ResponseBody
    Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();

        map.put("hello", "master haku");
        map.put("welcome", "kelvin gu");

        return map;
    }
}



