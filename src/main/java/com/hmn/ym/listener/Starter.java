package com.hmn.ym.listener;
import javax.servlet.ServletContext;

/**
 * 缓存类接口
 * @author liutq
 *
 */
public interface Starter {
    public void init(ServletContext ctx);
}
