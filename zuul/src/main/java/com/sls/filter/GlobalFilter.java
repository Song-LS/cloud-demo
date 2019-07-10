package com.sls.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sls
 **/
@Component
public class GlobalFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 设置过滤类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 设置过滤器优先级
        return -4;
    }

    @Override
    public boolean shouldFilter() {
        // 是否需要过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            // 返回错误信息
            currentContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            currentContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            currentContext.setSendZuulResponse(false);
            return null;
        }
        return null;
    }
}
