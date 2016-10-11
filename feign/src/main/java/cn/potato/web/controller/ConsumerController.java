package cn.potato.web.controller;

import cn.potato.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 李恒名 on 2016/10/11.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeService computeService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeService.add(10, 20);
    }
}