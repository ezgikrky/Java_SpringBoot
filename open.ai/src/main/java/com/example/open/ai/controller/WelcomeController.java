package com.example.open.ai.controller;

import com.example.open.ai.service.WelcomeService;
import org.springframework.web.bind.annotation.*;


@RestController // springi tanıtıp contrellerin içine yükledik.
@RequestMapping("/welcome")
public class WelcomeController  {

   // WelcomeServiceImpl service = new WelcomeServiceImpl(); ///bir class içindde başka bir clası kullanmak için newleriz.
    private final WelcomeService welcomeService;
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @PostMapping("/sayhi")
    public String gratings(@RequestBody String name){ // @RequestBody olmazsa null gelir isim gözükmez
        return welcomeService.sayHi(name);
    }

    // 2 farklı veri gçnderme tipi var
    @GetMapping("/{name}")
    public String sayHi(@PathVariable(name="name") String name){
        return welcomeService.sayHi(name);
    }
}
