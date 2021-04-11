package com.ike.demo.config;

import com.ike.demo.bo.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.ike.demo.controller")
                .title("mall-demo系统")
                .description("SpringBoot版本中的一些示例")
                .contactName("ike")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
