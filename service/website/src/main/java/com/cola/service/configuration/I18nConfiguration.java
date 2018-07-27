package com.cola.service.configuration;

import com.cola.service.website.support.LocaleMessageSourceService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * Created by jiachen.shi on 7/19/2017.
 */
@Configuration
public class I18nConfiguration {

    @Bean(name="localeMessageSourceService")
    @ConditionalOnClass(LocaleMessageSourceService.class)
    public LocaleMessageSourceService localeMessageSourceService(){
        LocaleMessageSourceService localeMessageSourceService = new LocaleMessageSourceService();
        return localeMessageSourceService;
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        return sessionLocaleResolver;
    }

}
