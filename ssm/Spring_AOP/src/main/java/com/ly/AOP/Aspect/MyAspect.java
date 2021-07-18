package com.ly.AOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {



    public void abc(){
        System.out.println("前置增强....");
    }


    public void after(){
        System.out.println("后置增强....");
    }

//    环绕的要带参数ProceedingJoinPoint正在执行的连接点--切点(连接点，就是有资格被增强的方法)
    public Object hr(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强....");

//        中间切点方法
        Object proceed = null;

        proceed = pjp.proceed();

        System.out.println("环绕后增强....");

        return proceed;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强....");
    }

    public void afterr(){
        System.out.println("最终增强....");
    }



}
