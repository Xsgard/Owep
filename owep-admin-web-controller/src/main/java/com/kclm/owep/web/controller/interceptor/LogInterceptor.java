package com.kclm.owep.web.controller.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Asgard
 * @version 1.0
 * @description: LogInterceptor 日志拦截器
 * @date 2023/7/29 13:15
 */
@Slf4j
@Component
public class LogInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


        Long startTime = (Long) request.getAttribute("startTime");
        String requester = (String) request.getAttribute("requester");
        String requestURI = (String) request.getAttribute("requestURI");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(startTime);
        String time = sdf.format(date);
        long cost = System.currentTimeMillis() - startTime;

        log.info("请求详细信息：");
        log.info("请求URI：{}", requestURI);

        log.info("请求人：{}", requester);

        log.info("请求开始时间：{}", time);

        log.info("请求共耗时：{}ms", cost);


    }
}
