package cn.lookk.consumer.web;

import cn.lookk.consumer.feign.UserFeignClient;
import cn.lookk.consumer.vo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserInfoController
 * @Description: 用户信息Controller
 * @Author jiaoxiangyu
 * @Date 2020/11/9
 * @Version 1.0
 * @Since JDK1.8
 */
@RestController
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public UserInfo findById(@PathVariable Long id){

        UserInfo user = userFeignClient.findById(id);

        logger.info("UserInfoController findById, id={}, user={}", id, user);
        return user;
    }
}
