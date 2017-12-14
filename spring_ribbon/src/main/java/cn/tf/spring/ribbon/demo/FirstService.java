package cn.tf.spring.ribbon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FirstService {

    @Autowired
    RestTemplate  restTemplate;

    public  String firstService(String name){
        return restTemplate.getForObject("http://CLIENT-ONE/hello?name="+name,String.class);
    }
}
