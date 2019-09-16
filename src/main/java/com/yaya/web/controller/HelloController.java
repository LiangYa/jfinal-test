package com.yaya.web.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {
//    public void index()
//    {
//        renderText("Hello JFinal World.");
//        System.out.println("Hello JFinal World.");
//    }
    public void index(String name)
    {
        renderText("Hello,"+ name);
        System.out.println("Hello,"+ name);
    }

    public void test()
    {
        renderText("Hello YY.");
        System.out.println("Hello JFinal World.");
    }

    @ActionKey("login")
    public void test2()
    {
        renderText("Hello YaYa.");
        System.out.println("Hello JFinal World.");
    }
//    该注解还可以让 actionKey 中使用减号或 数字等字符，如“/login/123-456”
    @ActionKey("login/123-456")
    public void test3()
    {
        renderText("Hello MM.");
        System.out.println("Hello JFinal World.");
    }


}
