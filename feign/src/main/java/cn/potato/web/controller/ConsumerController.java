package cn.potato.web.controller;

import cn.potato.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 李恒名 on 2016/10/11.
 */
@RefreshScope
@RestController
public class ConsumerController {
    @Autowired
    ComputeService computeService;

    @Value("${from:NULL}")
    private String from;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return computeService.add(a, b);
    }

    @RequestMapping("/from")
    public String from() {
        System.out.println(from);
        return from;
    }
}