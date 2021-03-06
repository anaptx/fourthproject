package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;
//    借助 RestTemplate，Spring应用能够方便地使用REST资源
//    Spring的 RestTemplate访问使用了模版方法的设计模式.
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name,String.class);
//        发送一个HTTP GET请求，返回的请求体将映射为一个对象
    }
}
