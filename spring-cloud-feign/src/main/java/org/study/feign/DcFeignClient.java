package org.study.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcFeignClient {

    @GetMapping("/dc")
    String consumer();

}