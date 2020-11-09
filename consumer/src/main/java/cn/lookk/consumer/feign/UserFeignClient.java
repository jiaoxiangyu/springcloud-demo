package cn.lookk.consumer.feign;

import cn.lookk.consumer.vo.UserInfo;
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
@FeignClient(name = "provider")
public interface UserFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    UserInfo findById(@PathVariable("id") Long id);
}
