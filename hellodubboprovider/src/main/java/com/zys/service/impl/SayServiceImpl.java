package com.zys.service.impl;

import com.zys.service.SayService;

public class SayServiceImpl implements SayService {

    @Override
    public String say(String name) {
        return "Hello "+name+":20882";
    }
}
