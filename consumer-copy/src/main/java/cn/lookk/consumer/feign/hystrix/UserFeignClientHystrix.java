package cn.lookk.consumer.feign.hystrix;

import cn.lookk.consumer.feign.UserFeignClient;
import cn.lookk.consumer.vo.UserInfo;
import cn.lookk.handleexception.util.ResultUtil;
import cn.lookk.handleexception.vo.Result;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserFeignClientHystrix
 * @Description: 用户信息熔断器
 * @Author jiaoxiangyu
 * @Date 2020/11/10
 * @Version 1.0
 * @Since JDK1.8
 */
@Component
public class UserFeignClientHystrix implements UserFeignClient {
    @Override
    public Result findById(Long id) {
        return ResultUtil.error(501, "无法访问");
    }

    @Override
    public Result findByName(String name) {
        return ResultUtil.error(501, "无法访问");
    }
}
