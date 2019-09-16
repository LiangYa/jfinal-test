package com.yaya.web.config;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.yaya.web.controller.HelloController;

/**
 * 基于 JFinal 的 web 项目需要创建一个继承自 JFinalConfig 类的子类，该类用于对整个 web
 * 项目进行配置。
 */
public class DemoConfig extends JFinalConfig {
    /**
     * 默认视图类型 ViewType的配置，如下代码配置了 JFinal 运行在开发模式下且默认视图类型为 JSP：
     * @param constants
     */
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true); //
        constants.setViewType(ViewType.JSP);  // JFinal 运行在开发模式下且默认视图类型为 JSP
        //urlPara 是为了能在 url 中携带参数 值，urlPara 可以在一次请求中同时携带多个值。JFinal 默认使用减号“-”来分隔多个值
        constants.setUrlParaSeparator("&");//设置分隔符
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", HelloController.class);
//        routes.add("/hello/yaya", HelloController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
