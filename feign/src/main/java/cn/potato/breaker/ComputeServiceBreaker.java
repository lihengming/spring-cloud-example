package cn.potato.breaker;

import cn.potato.service.ComputeService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 李恒名 on 2016/10/11.
 */
@Component
public class ComputeServiceBreaker implements ComputeService{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -1;
    }
}
