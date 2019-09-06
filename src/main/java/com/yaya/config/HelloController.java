package com.yaya.config;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
    public void index()
    {
        renderText("Hello JFinal World.");
        System.out.println("Hello JFinal World.");
    }
}
