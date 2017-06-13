package com.hong.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义403
 * Created by hong on 2017/6/13.
 */
public class AccessDeniedServletHandler implements AccessDeniedHandler {

    private static final String NO_PERMISSIONS_PAGE_PATH="/403.html";

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.sendRedirect(NO_PERMISSIONS_PAGE_PATH);
    }
}
