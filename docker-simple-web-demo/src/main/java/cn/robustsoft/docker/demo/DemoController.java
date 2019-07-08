package cn.robustsoft.docker.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : gb 2019/7/8
 */
@RestController
public class DemoController {

    @RequestMapping("demo")
    public String index(){
        return "docker run hello world";
    }
}
