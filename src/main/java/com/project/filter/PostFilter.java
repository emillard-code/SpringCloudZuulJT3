package com.project.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PostFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PostFilter.class);

    @Override
    public String filterType() {

        // return "post";
        return FilterConstants.POST_TYPE;

    }

    @Override
    public int filterOrder() {

        // return 1;
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;

    }

    @Override
    public boolean shouldFilter() {

        return true;

    }

    @Override
    public Object run() {

        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();

        log.info("PostFilter: " + String.format("response's content type is %s", response.getStatus()));

        return null;

    }

}