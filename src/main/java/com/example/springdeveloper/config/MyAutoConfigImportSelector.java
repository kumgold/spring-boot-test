package com.example.springdeveloper.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "com.example.springdeveloper.config.autoconfig.DispatcherServletConfig",
                "com.example.springdeveloper.config.autoconfig.TomcatWebServerConfig"
        };
    }
}