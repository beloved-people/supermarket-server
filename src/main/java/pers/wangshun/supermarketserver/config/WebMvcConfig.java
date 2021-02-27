package pers.wangshun.supermarketserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author WangShun
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login.html");
        registry.addViewController("/main.html").setViewName("dashboard");
        registry.addViewController("/vipMain.html").setViewName("/vip/vipInfo.html");
        registry.addViewController("/cashLogout").setViewName("/salespersonLogin.html");
        registry.addViewController("/cashPage.html").setViewName("/cashier/payPage.html");
    }
}
