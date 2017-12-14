package cn.tf.spring.feign.spring_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="client-one")
public interface SchedualServiceHi {

    //这个要和之前的工程eruake中配置的/hello相对应
   @RequestMapping(value="/hello",method = RequestMethod.GET)
   String FirstClientOne(@RequestParam(value="name") String name);

}
