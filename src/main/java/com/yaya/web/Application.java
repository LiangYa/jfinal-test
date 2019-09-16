package com.yaya.web;

import com.jfinal.core.JFinal;

public class Application {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8080,"/",5);
    }
}
