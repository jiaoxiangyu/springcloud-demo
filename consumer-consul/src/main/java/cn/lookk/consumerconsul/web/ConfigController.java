package cn.lookk.consumerconsul.web;

import cn.lookk.handleexception.util.ResultUtil;
import cn.lookk.handleexception.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2020/11/12
 * @Version 1.0
 * @Since JDK1.8
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {


    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

    /*@Value("${config.info}")
    private String configInfo;

    @GetMapping("/info")
    public Result findByName(){
        logger.info("configInfo={}", configInfo);
        return ResultUtil.success(configInfo);
    }*/
}
