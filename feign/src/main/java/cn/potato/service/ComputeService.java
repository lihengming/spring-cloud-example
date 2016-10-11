package cn.potato.service;

import cn.potato.breaker.ComputeServiceBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 李恒名 on 2016/10/11.
 */
@FeignClient(value = "COMPUTE-SERVICE",fallback = ComputeServiceBreaker.class)
public interface ComputeService {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
