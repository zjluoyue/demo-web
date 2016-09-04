package org.zjluoyue.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by zjluoyue on 2016/8/29.
 */
@Order(1)
public class SecurityIniter extends AbstractSecurityWebApplicationInitializer {
}
