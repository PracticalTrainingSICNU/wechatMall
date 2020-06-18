package edu.sicnu.jerry.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created on  2020/6/18-15:32
 *
 * @author 张友发
 */
@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "excution")
}
