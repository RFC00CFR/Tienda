
package com.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
Internacionalozation --- i18n  - - - 18 letas entre I y n
* Locale: representa es el lenguaje, la region geografica, variantes del dialecto / idioma, de un usuario
* SessionLocaleResolver: guardar el locale seleccionado por un usuario como atributo en el hhtp
* LocaleChangeInterceptor: detectar cualquier cambio de parte del usuario hacia lo que es el locale
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
//    @Bean
//    public SessionLocaleResolver localeResolver(){
//        var slr = new SessionLocaleResolver();
//        slr.setDefaultLocale(new Locale("en"));
//        return slr;
//    }
    
    @Bean
    public SessionLocaleResolver localeResolver() {
        final SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("en", "US"));
        return localeResolver;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
//        lci.setParamName("lang");
//        return lci;
//    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registro) {
        registro.addInterceptor(localeChangeInterceptor());
    }
}
