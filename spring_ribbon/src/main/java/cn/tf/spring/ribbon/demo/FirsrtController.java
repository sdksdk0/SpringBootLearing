package cn.tf.spring.ribbon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirsrtController {

    @Autowired
    FirstService firstService;

    @RequestMapping(value="/hi")
    public String hi(@RequestParam  String name){
        return firstService.firstService(name);
    }
}
