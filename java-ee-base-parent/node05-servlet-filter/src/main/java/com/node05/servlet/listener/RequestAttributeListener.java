package com.node05.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
/**
 * Request属性监听
 */
public class RequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent evt) {
        System.out.println("Request添加属性："+evt.getName()+";"+evt.getValue());
    }
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent evt) {
        System.out.println("Request移除属性："+evt.getName()+";"+evt.getValue());
    }
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent evt) {
        System.out.println("Request替换属性："+evt.getName()+";"+evt.getValue());
    }
}
