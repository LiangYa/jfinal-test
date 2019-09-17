package com.yaya.web.config;

import com.jfinal.config.Routes;
import com.yaya.web.controller.HelloController;

/**
 * 后端路由
 */
public class AdminRoutes extends Routes {
    @Override
    public void config() {
        add("/hello",HelloController.class);
    }
}
