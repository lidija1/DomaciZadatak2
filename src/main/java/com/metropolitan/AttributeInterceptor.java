package com.metropolitan;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AttributeInterceptor {

    @Before("@annotation(com.metropolitan.PositiveAttribute)")
    public void beforeAdvice() {
        System.out.println("Before advice: Method intercepted before execution");
    }

    @After("@annotation(com.metropolitan.PositiveAttribute)")
    public void afterAdvice() {
        System.out.println("After advice: Method intercepted after execution");
    }

    @AfterThrowing(pointcut = "@annotation(com.metropolitan.PositiveAttribute)", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("After throwing advice: Exception occurred - " + ex.getMessage());
    }

    @AfterReturning(pointcut = "@annotation(com.metropolitan.PositiveAttribute)", returning = "result")
    public void afterReturningAdvice(Object result) {
        System.out.println("After returning advice: Method returned successfully with result: " + result);
    }

    @Around("@annotation(com.metropolitan.PositiveAttribute)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice: Before method execution");
        Object result = joinPoint.proceed();
        System.out.println("Around advice: After method execution");
        return result;
    }
}
