package com.ly.ZjAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component("myAspect")
@Aspect//标注当前类是一个切面类
public class MyAspect {



//    配置前置增强
    @Before(value = "execution(public * com.ly.ZjAOP.*.*(..))")
    public void abc(){
        System.out.println("前置增强....");
    }


    public void after(){
        System.out.println("后置增强....");
    }


    public void afterr(){
        System.out.println("最终增强....");
    }



//定义切点表达式
    @Pointcut("execution(public * com.ly.ZjAOP.*.*(..))")
    public void pointcut(){
    }

//    抽取后调用1
    @After("MyAspect.pointcut()")
    public void afterThrowing(){
        System.out.println("异常抛出增强....");
    }

//    抽取后调用2
    @Around("pointcut()")
//    环绕的要带参数ProceedingJoinPoint正在执行的连接点--切点(连接点，就是有资格被增强的方法)
    public Object hr(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强....");
//        中间切点方法
        Object proceed = null;
        proceed = pjp.proceed();
        System.out.println("环绕后增强....");
        return proceed;
    }


}
