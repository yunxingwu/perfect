package com.star.perfect.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by  伍运星  on   2016/3/31.
 */
public class InitBean implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("execute afterProperties");
    }
}
