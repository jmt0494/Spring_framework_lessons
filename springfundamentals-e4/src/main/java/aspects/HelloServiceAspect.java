package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
// import org.aspectj.lang.annotation.After;
// import org.aspectj.lang.annotation.AfterReturning;
// import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
    
    // @Before("execution(* services.HelloService.hello(..))")
    // public void before() {
    //     System.out.println("A");
    // }

    // @After("execution(* services.HelloService.hello(..))")
    // public void after() {
    //     System.out.println("B");
    // }

    // @AfterReturning("execution(* services.HelloService.hello(..))")
    // public void afterReturning() {
    //     System.out.println("C");
    // }

    // @AfterThrowing("execution(* services.HelloService.hello(..))")
    // public void afterThrowing() {
    //     System.out.println("D");
    // }
    @Around("execution(* services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("A");
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("B");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }
}
