package cn.lookk.consumerconsul.feign;

import cn.lookk.consumerconsul.feign.hystrix.UserFeignClientHystrix;
import cn.lookk.handleexception.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: UserFeignClient
 * @Description: 用户信息FeignClient
 * @Author jiaoxiangyu
 * @Date 2020/11/9
 * @Version 1.0
 * @Since JDK1.8
 */
@FeignClient(name = "provider-consul", fallback = UserFeignClientHystrix.class)
public interface UserFeignClient {

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    Result findById(@PathVariable("id") Long id);

    @RequestMapping(value = "user/name/{name}", method = RequestMethod.GET)
    Result findByName(@PathVariable("name") String name);

}
