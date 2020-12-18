package cn.lookk.providerconsul.web;

import cn.lookk.handleexception.util.ResultUtil;
import cn.lookk.handleexception.vo.Result;
import cn.lookk.providerconsul.vo.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/user")
public class UserInfoController {


    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){

        UserInfo user = new UserInfo();
        user.setId(2L);
        user.setName("提供者-2");

        logger.info("UserInfoController findById, id={}, user={}", id, user);
        return ResultUtil.success(user);
    }

    @GetMapping("/name/{name}")
    public Result findByName(@PathVariable("name") String name){

        UserInfo user = new UserInfo();
        user.setId(22L);
        user.setName(name);

        logger.info("UserInfoController findByName, name={}, user={}", name, user);
        return ResultUtil.success(user);
    }
}
