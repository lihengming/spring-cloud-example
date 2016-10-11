package cn.potato;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 李恒名 on 2016/10/11.
 */
@EnableZuulProxy
@SpringCloudApplication
public class GetWayServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GetWayServerApplication.class).web(true).run(args);
    }
}
