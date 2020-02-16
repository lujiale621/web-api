package org.it.web.component;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class LocaleResolverm implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        Locale lc = Locale.getDefault();
        String l = httpServletRequest.getParameter("l");
        if(!StringUtils.isEmpty(l)){
            String[] split=l.split("_");
            lc=new Locale(split[0],split[1]);
        }
        return lc;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
