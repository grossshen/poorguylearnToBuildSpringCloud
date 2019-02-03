package tech.poorguy.serverfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.poorguy.serverfeign.feignInterface.HiInterface;

@RestController
public class Controller {
    @Autowired
    HiInterface hiInterface;
    @RequestMapping("/hi")
    public String hi(){
        return hiInterface.sayHiFromClientOne();
    }
}
