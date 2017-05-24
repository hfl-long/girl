package com.hfl.controller;

import com.hfl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:黄飞龙
 * @Date: Created in 16:57 2017/5/15
 */

@RestController
@RequestMapping("/hello")
//@Controller
//@ResponseBody//@RestController=@Controller + @ResponseBody
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
//    @RequestMapping(value = "/{id}/say",method = RequestMethod.GET)//默认情况下时是post或者是get
//    @RequestMapping(value = "/say",method = RequestMethod.GET)//默认情况下时是post或者是get
    @GetMapping(value = "/say")
    /***
     * @PathVariable 获取url中的数据
     * @RequestParam 获取请求参数中的值
     * @GetMapping 组合注解
     */
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id:"+ myId;
//        return girlProperties.getCupSize();
//        return "index";
    }

}
